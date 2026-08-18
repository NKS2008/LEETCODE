class Solution {
    public int largestInteger(int[] nums, int k) {
        int [] f = new int[1024];
        int n = nums.length;
        int c = -1;
        for(int x : nums){
            f[x]++;
        }
        for(int i = 0; i < n; i++){
            if(k == n || f[nums[i]]==1 && (k == 1 || i == 0 || i == n-1)){
                c = Math.max(c, nums[i]);
            }
        }
        return c;
    }
}