class Solution {
    public boolean uniformArray(int[] nums1) {
        int oc = 0;
        int mo = Integer.MAX_VALUE;
        for (int num : nums1) {
            if ((num & 1) == 1) {
                oc++;
                mo = Math.min(mo, num);
            }
        }
        int n = nums1.length;
        if (oc == 0 || oc == n) {
            return true;
        }
        for (int num : nums1) {
            if ((num & 1) == 0 && num < mo) {
                return false;
            }
        }
        return true;
    }
}