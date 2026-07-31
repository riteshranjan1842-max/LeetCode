class Solution {
    public static int uniquePaths(int m, int n) {
       int[][] dp = new int[m+1][n+1];
        return helper(m, n, dp);
    }
    public static int helper(int m, int n, int[][] dp) {
        if(m == 1 || n == 1) return 1;
        if(dp[m][n] != 0) return dp[m][n];
        return dp[m][n] = helper(m-1, n, dp) + helper(m, n-1, dp);
    }

    // another method
    //  public int uniquePaths(int m, int n) {
    //     return  paths(0,0,m-1,n-1);
    // }
    // public int paths(int cr, int cc, int lr, int lc){
    //     if(cr==lr && cc==lc) return 1;
    //     if(cr>lr || cc>lc) return 0;
    //         int right =  paths(cr, cc+1, lr,lc);
    //         int down =  paths(cr+1, cc, lr,lc);
    //         return right+down;
    // }
}