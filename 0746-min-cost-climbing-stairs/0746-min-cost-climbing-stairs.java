class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if(n==0) return cost[0];
       int[] dp = new int[3]; // 0 to n-1
       dp[0] = cost[0];
       if(n>1) dp[1] = cost[1];
       if(n==2) return Math.min(dp[0],dp[1]);
        for(int i = 2; i < n; i++){
            dp[2] = Math.min(dp[1], dp[0]) + cost[i];
            dp[0] = dp[1];
            dp[1] = dp[2];
        }
        return Math.min(dp[0], dp[1]);
    }
}