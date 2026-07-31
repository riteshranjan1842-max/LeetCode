class Solution {
    public int minPathSum(int[][] grid) {
        int dp[][] = new int[grid.length][grid[0].length];
        return helper(0, 0, grid,dp);
    }
    public int helper(int i, int j, int[][] grid, int[][] dp) {
        if(i== grid.length-1 && j == grid[0].length-1) return grid[i][j];
        if(i==grid.length || j==grid[0].length) return Integer.MAX_VALUE;
        if(dp[i][j]!=0) return dp[i][j];
        return dp[i][j] = grid[i][j] + Math.min(helper(i+1, j, grid, dp), helper(i, j+1, grid, dp));
    }
}