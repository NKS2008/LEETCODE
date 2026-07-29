class Solution {
    public long sumAndMultiply(int n) {
        String nu = String.valueOf(n);
        int m = nu.length();
        StringBuilder nm = new StringBuilder();
        long s = 0;
        for(int i = 0;i < m; i++){
            char c = nu.charAt(i);
            if(c != '0'){
                nm.append(c);
                s += c - '0';
            }
        }
        long num = 0;
        if (nm.length() > 0) {
            num = Long.parseLong(nm.toString());
        }
        return num * s;
    }
}