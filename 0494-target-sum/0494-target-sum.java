class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return helper(0, nums, target);
    }
    public int helper(int i,  int[] nums, int target){
        if(i==nums.length){
            return (target==0) ? 1 : 0;
        } 
        int add = helper(i+1, nums, target-nums[i]);
        int sub = helper(i+1, nums, target+nums[i]);
        return add + sub;
    }
}