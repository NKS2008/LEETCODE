class Solution {
    public void setZeroes(int[][] m) {
        int ma = m.length;
        int n = m[0].length;
        boolean fr = false;
        boolean fc = false;
        for(int i = 0; i < ma; i++){
            if(m[i][0] == 0){
                fr = true;
                break;
            }
        }
        for(int j = 0; j < n; j++){
            if(m[0][j] == 0){
                fc = true;
                break;
            }
        }
        for(int i =1; i < ma; i++){
            for(int j = 1; j < n; j++){
                if(m[i][j] == 0){
                    m[i][0] = 0;
                    m[0][j] = 0;
                }
            }
        }
        for(int i = 1;i < ma; i++){
            for(int j = 1; j < n; j++){
                if(m[i][0] == 0 || m[0][j] == 0){
                    m[i][j] = 0;
                }
            }
        }
        if(fr){
            for(int i = 0; i < ma; i++){
                m[i][0] = 0;
            }
        }
        if(fc){
            for(int j = 0; j < n; j++){
                m[0][j] = 0;
            }
        }
    }
}