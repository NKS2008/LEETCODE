class Solution {
    public int search(int[] nums, int t) {
        int n = nums.length;
        //Arrays.sort(nums);
        /*
        int l = 0;
        int r = n - 1;
        for(int i = 0; i < n ;i++){
            int te = nums[l]; nums[l] = nums[r]; nums[r] = te;
        }
        */
        for(int i = 0; i < n; i++){
            if(nums[i] == t){
                return i;
            }
        }
        return -1;
    }
}