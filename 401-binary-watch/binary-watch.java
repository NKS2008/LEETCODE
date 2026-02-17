import java.util.*;

class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<>();
        
        for (int h = 0; h < 12; h++) {
            for (int m = 0; m < 60; m++) {
                if (Integer.bitCount(h) + Integer.bitCount(m) == turnedOn) {
                    String time = h + ":";
                    if (m < 10) {
                        time += "0" + m;
                    } else {
                        time += m;
                    }
                    result.add(time);
                }
            }
        }
        
        return result;
    }
}
