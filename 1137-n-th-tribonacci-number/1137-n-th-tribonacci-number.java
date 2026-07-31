class Solution {
    public int tribonacci(int n) {
        if(n<=1) return n;
        if(n==2) return 1;
       int[] dp = new int[n+1];
       dp[0] = 0;
       dp[1] = 1;
       dp[2] = 1;
       int j = 3;
       for(int i = 0; i<n+1-3; i++){
           dp[j++] = dp[i] + dp[i+1] + dp[i+2];
       }
       return dp[n];
    }
}