class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = {0,0};
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length; i++){
            int rem = target - nums[i];
            if(map.containsKey(rem)) {
                ans[0] = i;
                ans[1] = map.get(rem);
                break;
            }
            map.put(nums[i],i);
        }
        return ans;
    }
}