class Solution {
    public int rearrangeCharacters(String s, String target) {
        int [] f = new int[26], f2 = new int[26];
        for(char c : s.toCharArray()){
            f[c - 'a']++;
        }
        for(char c : target.toCharArray()){
            f2[c-'a']++;
        }
        int m = Integer.MAX_VALUE;
        for(char c : target.toCharArray()){
            m = Math.min(m, f[c - 'a']/f2[c - 'a']);
        }
        return m;
    }
}