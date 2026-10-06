class Solution {
    public int minAddToMakeValid(String s) {
        int n = s.length();
        int o = 0;
        int a = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                o++;
            }
            else{
                if(o > 0){
                    o--;
                }
                else{
                    a++;
                }
            }
        }
        return a + o;
    }
}