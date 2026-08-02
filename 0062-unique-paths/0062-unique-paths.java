class Solution {
    public static int uniquePaths(int m, int n) {
        if(m==1 || n==1) return 1;
        int[][] dp = new int[2][n];
        for(int j = 0; j<n; j++){ // filling zeroth row with 1
            dp[0][j] = 1;
        }
        dp[1][0] = 1;
        for(int i = 1; i<=m-1; i++){
            // filling 1st row
            for(int j = 1; j<n; j++){
                dp[1][j] = dp[1][j-1] + dp[0][j];
            }
            // copyting 1st row to zeroth row
            for(int j = 0; j<n; j++){
                dp[0][j] = dp[1][j];
            }
            dp[1][0] = 1;
        }
        return dp[1][n-1];
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