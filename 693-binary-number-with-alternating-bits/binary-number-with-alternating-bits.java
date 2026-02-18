class Solution {
    public boolean hasAlternatingBits(int n) {
        String a = Integer.toBinaryString(n);
        int s = a.length();
        for(int i = 0; i < s-1; i++){
            if(a.charAt(i) == a.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
}