class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) Arrays.fill(dp[i], -1);
            return edit(m-1, n-1, new StringBuilder(word1), new StringBuilder(word2), dp);
    }
    private int edit(int i, int j, StringBuilder s1, StringBuilder s2, int[][] dp) {
        if(i<0) return j+1; // inserting remaining chars of s2
        if(j<0) return i+1; // remove extra chars of s1
         if(dp[i][j]!=-1) return dp[i][j];
           if(s1.charAt(i) == s2.charAt(j)) return dp[i][j] = edit(i-1, j-1, s1, s2, dp);
          int replace = 1 + edit(i-1, j-1, s1, s2, dp);
          int remove = 1 + edit(i-1, j, s1, s2, dp);
          int insert = 1 + edit(i, j-1, s1, s2, dp);
          return dp[i][j] = Math.min(replace, Math.min(remove, insert));
    }
}