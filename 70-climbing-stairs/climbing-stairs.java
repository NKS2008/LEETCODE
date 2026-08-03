class Solution {
    public int climbStairs(int n) {
        /*
        if(n<= 2){
            return n;
        }
        int p2 = 1;
        int p1 = 2;
        int c = 0;
        for(int i =3; i <= n; i++ ){
            c = p1+p2;
            p2 = p1;
            p1 = c;
        }
        return c;
        */
        if(n <= 2){
            return n;
        }
        int p = 1; 
        int c = 1;
        for(int i = 2; i <= n; i++){
            int t = c;
            c = p+c;
            p = t;
        }
        return c;
    }
}