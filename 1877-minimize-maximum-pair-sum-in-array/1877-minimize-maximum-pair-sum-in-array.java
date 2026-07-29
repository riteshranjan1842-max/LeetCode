class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0, j = n-1;
        int max = Integer.MIN_VALUE;
        while(i<=j){
            max = Math.max(max, nums[i]+nums[j]);
            i++;
            j--;
        }
        return max;
    }
}
// Method 1
// PriorityQueue<Integer> min = new PriorityQueue<>();
//         PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
//         int n = nums.length;
//         int maxSum = Integer.MIN_VALUE;
//         for(int ele : nums){
//             min.add(ele);
//             max.add(ele);
//         }
//         for(int i = 0; i<=n/2; i++){
//             maxSum = Math.max(min.remove()+max.remove(), maxSum);
//         }
//         return maxSum;