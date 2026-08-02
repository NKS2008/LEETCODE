class Solution {
    public int maxProduct(int[] nums) {
        int a = nums[0];
        int p = 1;
        int s = 1;
        int n =  nums.length;
        for(int i = 0; i < n; i++){
            if(p==0) p = 1;
            if(s == 0) s = 1;
            p *= nums[i];
            s *= nums[n-1-i];
            a = Math.max(a, Math.max(p,s));
        }
        return a;
    }
}