class Solution {
    public int matrixSum(int[][] nums) {
        int n = nums.length;
        int m = nums[0].length;
        int sum = 0;
        for(int i = 0; i<n; i++){
            Arrays.sort(nums[i]);
        }
        for(int i = 0; i<m; i++){
            int[] arr = new int[n];
            for(int j = 0; j<n; j++){
                arr[j] = nums[j][i];
            }
            sum += maxNum(arr);
        }
        return sum;
    }
    public int maxNum(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max) max = arr[i];
        }
        return max;
    }
}