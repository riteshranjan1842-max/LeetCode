class Solution {
     public int climbStairs(int n) {
        if(n<=2) return n;
      int[] dp = new int[n+1];
      dp[0] = 0;
      dp[1] = 1;
      dp[2] = 2;
      for(int i = 3; i<n+1; i++){
        dp[i] = dp[i-1] + dp[i-2];
      }
     return dp[n];
    }



    // static int dp[];
    // public int climbStairs(int n) {
    //     dp = new int[n+1];
    //     return climb(n);
    // }
    // public int climb(int n) {
    //     if(n<=2) return n;
    //     if(dp[n]>0) return dp[n];
    //     return dp[n] = climb(n-1) + climb(n-2);
    // }
}