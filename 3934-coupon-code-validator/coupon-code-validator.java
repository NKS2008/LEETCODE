import java.util.*;

class Solution {
    public List<String> validateCoupons(
            String[] code,
            String[] businessLine,
            boolean[] isActive) {

        Map<String, List<String>> map = new HashMap<>();

        map.put("electronics", new ArrayList<>());
        map.put("grocery", new ArrayList<>());
        map.put("pharmacy", new ArrayList<>());
        map.put("restaurant", new ArrayList<>());

        for (int i = 0; i < code.length; i++) {

            if (!isActive[i]) continue;

            if (code[i] == null || code[i].isEmpty()) continue;

            if (!code[i].matches("[a-zA-Z0-9_]+")) continue;

            if (!map.containsKey(businessLine[i])) continue;

            map.get(businessLine[i]).add(code[i]);
        }

        List<String> result = new ArrayList<>();
        String[] order = {"electronics", "grocery", "pharmacy", "restaurant"};

        for (String key : order) {
            Collections.sort(map.get(key));
            result.addAll(map.get(key));
        }

        return result;
    }
}
