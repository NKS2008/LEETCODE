class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] n3 = new int[n+m];
        int in = 0;
        for(int i = 0; i < m ;i++){
            n3[in++] = nums1[i];
        }
        for(int j = 0; j < n; j++){
            n3[in++] = nums2[j];
        }
        Arrays.sort(n3);
        for(int i = 0; i < n+m; i++){
            nums1[i] = n3[i];
        }
    }
}