import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> m = new HashMap<>();
        int l = 0, ans = 0;
        
        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            
            if (m.containsKey(c) && m.get(c) >= l) {
                l = m.get(c) + 1;
            }
            
            m.put(c, r);
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
}
