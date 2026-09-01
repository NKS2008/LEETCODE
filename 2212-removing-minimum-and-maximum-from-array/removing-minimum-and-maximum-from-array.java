class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if(n == 1 || n == 0){
            return n;
        }
        int ma = 0;
        int mi = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] > nums[ma]){
                ma = i;
            }
            else if(nums[i] < nums[mi]){
                mi = i;
            }
        }
        if(mi > ma){
            int t = mi;
            mi = ma; ma = t;
        }
        int fs = ma + 1;
        int bs = n - mi;
        int bos = (mi + 1) + (n - ma);
        return Math.min(fs, Math.min(bs, bos));
    }
}