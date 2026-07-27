class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int p = 1;
        Arrays.sort(nums);
        p = (nums[n-1]-1)*(nums[n-2]-1);
        return p;
    }
}