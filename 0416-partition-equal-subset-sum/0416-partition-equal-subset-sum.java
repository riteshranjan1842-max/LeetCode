class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i =0; i<nums.length; i++){
            sum += nums[i];
        }
        if(sum%2==1) return false;
        int n = nums.length;
        int[][] dp = new int[n][sum+1];
        for(int i = 0; i<n; i++) Arrays.fill(dp[i], -1);
        return subsetSum(0, nums, sum/2,dp);
    }
    public boolean subsetSum(int i, int[] nums, int target, int[][] dp){
        if(i==nums.length) return false;
        if(target==0) return true;
        boolean ans = false;
        if(dp[i][target]!=-1) return (dp[i][target]==1) ? true : false;
        boolean skip = subsetSum(i+1, nums, target, dp);
        if(target-nums[i]<0) ans = skip;
        else{
              boolean pick = subsetSum(i+1, nums, target-nums[i], dp);
              ans = pick || skip;
        }
        dp[i][target] = (ans) ? 1 : 0;
        return ans;
    }
}