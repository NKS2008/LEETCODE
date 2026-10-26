class Solution {
    public int countIslands(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int ans = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] > 0){
                    long s = dfs(grid,i,j);
                    if(s % k == 0) ans++;
                }
            }
        }
        return ans;
    }
    private long dfs(int [][] g , int i, int j){
        int m = g.length, n = g[0].length;
        if(i < 0 || i >= m || j < 0 || j >= n || g[i][j] == 0){
            return 0;
        }
        long sum = g[i][j];
        g[i][j]=0;
        sum += dfs(g, i+1, j);
        sum += dfs(g, i-1, j);
        sum += dfs(g, i , j+1);
        sum += dfs(g, i , j-1);
        return sum;
    }
}