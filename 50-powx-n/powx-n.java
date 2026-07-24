/*
class Solution {
    public double myPow(double x, int n) {
       long p = n;
       double ans = 1.0;
       if( p < 0){
        x = 1/x;
        p = -p;
       }
       while (p > 0) {
            if (p % 2 == 1) {
                ans *= x;
            }
            x *= x;
            p /= 2;
        }
       return ans;
    }
}*/
class Solution {
    public double myPow(double x, int n) {
        long p = n;
        if (p < 0) {
            x = 1 / x;
            p = -p;
        }
        return power(x, p);
    }
    public double power(double x, long n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        if (n == 2) return x * x;
        if (n % 2 == 0)
            return power(power(x, n / 2), 2);
        else
            return x * power(power(x, n / 2), 2);
    }
}