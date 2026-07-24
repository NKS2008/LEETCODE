class Solution {
    public int subarrayGCD(int[] nums, int k) {
        int n = nums.length;
        int c = 0;
        for(int i = 0; i < n; i++){
            int g = 0;
            for(int j = i; j < n; j++){
                 g = gcd(g,nums[j]);
            
            if(g==k){
                c++;
            }
            else if(g<k) break;
        }
        }
        return c;
    }
    public int gcd(int a , int b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }
}