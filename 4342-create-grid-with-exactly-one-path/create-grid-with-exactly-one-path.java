class Solution {
    public String[] createGrid(int m, int n) {
        char [][] b = new char[m][n];
        for(int i = 0; i < n; i++){
            b[0][i] = '.';
        }
        for(int i = 0; i < m; i++){
            b[i][n-1] = '.';
        }
        String[] r = new String[m];
        for(int i = 0; i < m; i++){
            String res = "";
            for(int j = 0; j < n; j++){
                if(b[i][j] != '.'){
                    b[i][j] = '#';
                }
                res += b[i][j];
            }
            r[i] = res;
        }
        return r;
    }
}