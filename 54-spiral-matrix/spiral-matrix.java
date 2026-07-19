class Solution {
    public List<Integer> spiralOrder(int[][] a) {
        List<Integer> ans = new ArrayList<>();
        int t = 0;
        int b = a.length - 1;
        int l = 0;
        int r = a[0].length - 1;
        while (t <= b && l <= r) {
            for (int j = l; j <= r; j++)
                ans.add(a[t][j]);
            t++;
            for (int i = t; i <= b; i++)
                ans.add(a[i][r]);
            r--;
            if (t <= b) {
                for (int j = r; j >= l; j--)
                    ans.add(a[b][j]);
                b--;
            }
            if (l <= r) {
                for (int i = b; i >= t; i--)
                    ans.add(a[i][l]);
                l++;
            }
        }
        return ans;
    }
}