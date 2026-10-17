class Solution {
    public int largestAltitude(int[] gain) {
        int ma = 0;
        int ca = 0;
        for (int i = 0; i < gain.length; i++) {
            ca += gain[i];
            ma = Math.max(ma, ca);
        }
        return ma;
    }
}