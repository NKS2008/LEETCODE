class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int m = 0;
        int pre [] = new int[n];
        for(int i = 0; i < n; i++){
            m = Math.max(nums[i], m);
            pre[i] = gcd(nums[i], m);
        }
        Arrays.sort(pre);
        int l = 0;
        long s = 0;
        int r = n - 1;
        while(l < r){
            s += gcd(pre[l], pre[r]);
            l++;
            r--;
        }
        return s;
    }
    static int gcd(int a, int b){
        if (b == 0) return a;
        else return gcd(b, a%b);
    }
}