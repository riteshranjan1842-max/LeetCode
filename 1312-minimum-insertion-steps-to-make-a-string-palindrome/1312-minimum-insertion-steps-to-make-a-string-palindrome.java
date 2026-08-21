class Solution {
    public int minInsertions(String s) {
        return s.length() - longestPalindromeSubseq(s);
    }
    public int longestPalindromeSubseq(String s) {
        int m = s.length();
        String rev = new StringBuilder(s).reverse().toString();
        int n = rev.length();
        int[][] dp = new int[m][n];
        for(int i = 0; i<m; i++) Arrays.fill(dp[i], -1);
        return helper(m-1, n-1, new StringBuilder(s), new StringBuilder(rev), dp);
    }
    public int helper(int i, int j, StringBuilder a, StringBuilder b, int[][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        if(a.charAt(i)==b.charAt(j)) return dp[i][j] = 1 + helper(i-1, j-1, a, b, dp);
        else return dp[i][j] = Math.max(helper(i-1, j, a, b, dp), helper(i, j-1, a, b, dp));
    }
}