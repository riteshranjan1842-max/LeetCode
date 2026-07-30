class Solution {
    static int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length]; // 0 to n-1
        Arrays.fill(dp, -1);
        helper(0, cost);
        return Math.min(dp[0], dp[1]);
    }
    private int helper(int i, int[] cost) {
        if(i>=cost.length) return 0;
        if(dp[i]!=-1) return dp[i];
        return dp[i] = cost[i] + Math.min(helper(i+1, cost),helper(i+2, cost));
    }
}