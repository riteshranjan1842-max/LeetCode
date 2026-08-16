class Solution {
    static int absSum;
    public  int findTargetSumWays(int[] nums, int target) {
        absSum = 0;
        for(int ele : nums){
            absSum += Math.abs(ele);
        }
        int dp[][] = new int[nums.length][2*absSum+1];
        return helper(0, 0, nums, target, dp);
    }
    // i -> i to 0     sum -> sum to target-arrayAbsSum
    public int helper(int i,  int sum , int[] nums, int target, int[][] dp){
        if(i==nums.length){
            return (target==sum) ? 1 : 0;
        }
        if(dp[i][sum+absSum]!=0) return dp[i][sum+absSum];
        int add = helper(i+1,sum-nums[i], nums, target, dp);
        int sub = helper(i+1, sum+nums[i], nums, target,dp);
        return dp[i][sum+absSum] = add + sub;
    }
}