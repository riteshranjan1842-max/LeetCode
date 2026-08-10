class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount+1];
        for(int i = 0; i<n; i++) Arrays.fill(dp[i], -1);
        int ans = helper(0, amount, coins, dp);
        return (ans==Integer.MAX_VALUE) ? -1 : ans;
    }
    public int helper(int i,  int amount, int[] coins,  int[][] dp) {
        if(i==coins.length){
            if(amount==0) return 0; // valid ans
            else return Integer.MAX_VALUE; // invalid ans
        } 
        if(dp[i][amount] != -1) return dp[i][amount];
        int skip = helper(i+1, amount, coins, dp);
        if(amount<coins[i]) return dp[i][amount] = skip;
        int take = helper(i, amount-coins[i], coins, dp);
        int pick = (take==Integer.MAX_VALUE) ? take : take + 1;
        return dp[i][amount] = Math.min(pick, skip);
    }
}