class Solution {
    public int maxLength(int[] nums) {
        int best = 2, left = 0, p = 1;
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            while (gcd(p, x) > 1)
                p /= nums[left++];
            p *= x;
            best = Math.max(best, i - left + 1);
        }
        return best;
    }
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}