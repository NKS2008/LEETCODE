class Solution {
    public String smallestPalindrome(String s, int k) {
        int[] count = new int[26];
        int n = s.length();
        int halfLength = 0;
        long ways = 1;
        for (int i = 0; i < n / 2; i++) {
            count[s.charAt(i) - 'a']++;
        }
        StringBuilder leftHalf = new StringBuilder();
        outer:
        for (int ch = 25; ch >= 0; ch--) {
            if (count[ch] == 0)
                continue;
            int used = 1;
            while (used <= count[ch]) {
                halfLength++;
                ways = (ways * halfLength) / used;
                if (ways > k) {
                    for (int i = 0; i < ch; i++) {
                        while (count[i] > 0) {
                            leftHalf.append((char) ('a' + i));
                            count[i]--;
                        }
                    }
                    while (count[ch] > used) {
                        leftHalf.append((char) ('a' + ch));
                        count[ch]--;
                    }
                    break outer;
                }
                used++;
            }
        }
        if (k > ways)
            return "";
        for (int pos = 0; pos < halfLength; pos++) {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                int index = ch - 'a';
                if (count[index] == 0)
                    continue;
                long currentWays = (ways * count[index]) / (halfLength - pos);
                if (k <= currentWays) {
                    ways = currentWays;
                    count[index]--;
                    leftHalf.append(ch);
                    break;
                } else {
                    k -= currentWays;
                }
            }
        }
        if (n % 2 == 1) {
            leftHalf.append(s.charAt(n / 2));
        }
        for (int i = n / 2 - 1; i >= 0; i--) {
            leftHalf.append(leftHalf.charAt(i));
        }
        return leftHalf.toString();
    }
}