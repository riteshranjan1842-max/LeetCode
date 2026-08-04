class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int min = 101;
        int max = 0;
        for(int i = 0; i<nums.length; i++){
            if(max < nums[i]) max = nums[i];
            if(min > nums[i]) min = nums[i];
            set.add(nums[i]);
        }
        for(int i = min; i<=max; i++){
            if(!set.contains(i)) ans.add(i);
        }
        return ans;
    }
}