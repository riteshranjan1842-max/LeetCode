class Solution {
    static int[][] dp;
    public int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        dp = new int[m][n];
        for(int i = 0; i<m; i++) Arrays.fill(dp[i], -1);
        return helper(m-1, n-1, grid);
    }
    public int helper(int i, int j, int[][] grid){
        if(i<0 || j<0) return 0;
        if( grid[i][j]==1) return 0;
        if(i==0 && j==0) return 1;
        
        if(dp[i][j]!=-1) return dp[i][j];
        return dp[i][j] = helper(i-1, j, grid) + helper(i, j-1, grid);
    }
}