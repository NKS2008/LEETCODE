class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int m = Integer.MAX_VALUE;
        int [] ss = new int[n];
        ss[n-1] = nums[n-1];
        for(int i = n-2; i>=0; i--){
            ss[i] = Math.min(nums[i], ss[i+1]);
        }
        int [] ps = new int[n];
        ps[0] = nums[0];
        for(int i = 0; i < n; i++){
            if (i > 0) {
                ps[i] = Math.max(nums[i], ps[i - 1]);
            }
            if(ps[i] - ss[i] <= k){
                return i;
            }
        }
        return -1;
    }
}