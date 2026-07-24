/*class Solution {
    public List<List<String>> groupAnagrams(String[] s) {
        int n = s.length;
        for(int i = 0; i < n; i++){
            int j = i; j < n; j++){
                
            }
        }
    }
    static boolean ana(String a, String b){
        if(a.length() != b.length()){
            return false;
        }
        
        char [] x = a.toCharArray();
        char [] y = b.toCharArray();
        int n = x.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; i <n; j++){
                if(x[i] == y[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
*/
import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}