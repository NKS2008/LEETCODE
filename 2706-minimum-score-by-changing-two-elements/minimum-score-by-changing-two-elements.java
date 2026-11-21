class Solution {
    public int minimizeSum(int[] nums) {
        int s1 = Integer.MAX_VALUE , s2 = Integer.MAX_VALUE , s3 = Integer.MAX_VALUE;
        int l1 = 0, l2 = 0, l3 = 0;
        for(int x : nums){
            if(x < s1){
                s3 = s2;
                s2 = s1;
                s1 = x;
            }
            else if( x < s2){
                s3 = s2;
                s2 = x;
            }
            else if(x < s3){
                s3 = x;
            }
            if(x > l1){
                l3 = l2;
                l2 = l1;
                l1 = x;
            }
            else if(x > l2){
                l3 = l2;
                l2 = x;
            }
            else if(x > l3){
                l3 = x;
            }
        }
        return Math.min(l1 - s3, Math.min(l3 - s1 , l2 - s2));
    }
}