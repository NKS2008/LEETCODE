/*
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
*/
class Solution {
    public int minAddToMakeValid(String s) {
        int o = 0;
        int a = 0;
        Stack <Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '('){
                st.push(c);
            }
            else{
                if(!st.isEmpty() && st.peek() == '('){
                    st.pop();
                }
                else{
                    a++;
                }
            }
        }
        return a + st.size();
    }
}