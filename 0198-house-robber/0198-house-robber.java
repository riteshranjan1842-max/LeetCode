class Solution {
    public int rob(int[] arr) {
        int n = arr.length;
        if(n==1) return arr[0];
        int[] dp = new int[3]; // 0 to n-1
        dp[0] = arr[0];
        if(n>1) dp[1] =  Math.max(arr[0],arr[1]);
        dp[2] = dp[1];
        for (int i = 2; i <n ; i++) {
            dp[2] = Math.max(dp[0]+arr[i], dp[1]);
            dp[0] = dp[1];
            dp[1] = dp[2];
        }
        return dp[2];
    }
}