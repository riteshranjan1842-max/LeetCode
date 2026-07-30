class Solution {
    static int[] dp;
    public int rob(int[] arr) {
        dp = new int[arr.length]; // 0 to n-1
        Arrays.fill(dp, -1);
        return loot(0, arr);
    }
    public int loot(int index, int[] arr) {
        if(index >= arr.length) return 0;
        if(dp[index] > -1) return dp[index];
        int pick = arr[index] + loot(index + 2, arr);
        int skip =  loot(index + 1, arr);
        dp[index] = Math.max(pick, skip);
        return Math.max(pick, skip);
    }
     
}