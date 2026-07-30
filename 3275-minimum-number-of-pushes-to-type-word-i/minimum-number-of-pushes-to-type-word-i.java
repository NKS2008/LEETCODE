class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int l = 0;
        for(int i = 0; i < n; i++){
            l += (i/8)+1;
        }
        return l;
    }
}