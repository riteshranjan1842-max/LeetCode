class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums); // 1 2 4 5
        int i = 0, j = 1;
        while(j<nums.length){
            int k = (nums[j]-nums[i] != 1) ? nums[j] - nums[i] - 1 : 0;
            int t = 1;
            while(k-->0){
                  ans.add(nums[i] + t++);
            }
            j++;
            i++;
        }
        return ans;
    }
}