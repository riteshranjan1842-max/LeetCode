class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int a = text1.length(), b = text2.length();
        int[][] dp = new int[a][b];
        for (int i = 0; i < a; i++) Arrays.fill(dp[i], -1);
        return helper(a-1, b-1, new StringBuilder(text1), new StringBuilder(text2), dp);
    }
    private int helper(int i, int j, StringBuilder a, StringBuilder b, int[][] dp) {
        if(i<0 || j<0) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        if(a.charAt(i) == b.charAt(j))
            return dp[i][j] = 1 + helper(i-1, j-1, a, b,dp);
        else{
            return dp[i][j] =  Math.max(helper(i-1, j, a, b,dp), helper(i, j-1, a, b, dp));
        }
    }
}