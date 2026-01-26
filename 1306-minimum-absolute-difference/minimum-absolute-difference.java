import java.util.*;

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] a) {
        Arrays.sort(a);
        
        int d = Integer.MAX_VALUE;
        List<List<Integer>> r = new ArrayList<>();
        
        for (int i = 1; i < a.length; i++) {
            int x = a[i] - a[i - 1];
            
            if (x < d) {
                d = x;
                r.clear();
                r.add(Arrays.asList(a[i - 1], a[i]));
            } else if (x == d) {
                r.add(Arrays.asList(a[i - 1], a[i]));
            }
        }
        
        return r;
    }
}
