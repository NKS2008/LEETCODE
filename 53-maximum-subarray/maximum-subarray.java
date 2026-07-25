class Solution {
    public int maxSubArray(int[] arr) {
        int n = arr.length;
        int s = 0;
        int m = arr[0];
        for(int i = 0; i < n; i++){
            s += arr[i];
            s = Math.max(s, arr[i]);
            m = Math.max(s, m);
        }
        return m;
    }
}