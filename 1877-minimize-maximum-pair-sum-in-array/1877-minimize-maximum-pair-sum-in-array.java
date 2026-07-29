class Solution {
    public int minPairSum(int[] nums) {
        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        for(int ele : nums){
            min.add(ele);
            max.add(ele);
        }
        for(int i = 0; i<=n/2; i++){
            maxSum = Math.max(min.remove()+max.remove(), maxSum);
        }
        return maxSum;
    }
}