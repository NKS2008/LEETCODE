class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;
        int g = 0;
        Arrays.sort(nums);
        for(int i = 0; i < n; i++){
            g = gcd(nums[0] , nums[n-1]);
        }
        return g;
    }
    static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }
}