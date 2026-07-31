class Solution {
    public static int uniquePaths(int m, int n) {
       int[][] dp = new int[m][n];
       Arrays.fill(dp[0], 1);
       for( int i = 0; i < m; i++ ){
           dp[i][0] = 1;
       }
       for(int i = 1; i<m; i++){
           for(int j = 1; j<n; j++){
               dp[i][j] = dp[i-1][j] + dp[i][j-1];
           }
       }
       return dp[m-1][n-1];
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