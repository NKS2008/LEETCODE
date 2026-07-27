class Solution {
    public boolean searchMatrix(int[][] m, int t) {
        int n = m.length;
        int o = m[0].length;
        boolean f = false;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < o; j++){
                if(m[i][j] == t){
                    f = true;
                }
            }
        }
        return f;
    }
}