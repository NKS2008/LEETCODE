class Solution {
    public int mySqrt(int x) {
        if(x == 0 || x == 1){
            return x;
        }
        int l = 1;
        int r = x;
        int a = 0;

        while(l <= r){
            int m = l + (r - l)/2;
            long s = (long) m*m;
            if(s == x){
                return m;
            }
            else if(s < x){
                a = m;
                l = m + 1;
            }
            else {
                r = m-1 ;
            }
        }
        return a;
    }
}

