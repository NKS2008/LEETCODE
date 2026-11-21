class Solution {
    public int vowelConsonantScore(String s) {
        int v = 0;
        int co = 0;
        int n = s.length();
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            if(c >= 'a' && c <= 'z'){
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                    v++;
                }
                else{
                    co++;
                }
            }
        }
        return co > 0 ? v/co : 0;
    }
}