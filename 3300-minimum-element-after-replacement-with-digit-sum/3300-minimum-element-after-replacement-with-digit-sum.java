class Solution {
    public int minElement(int[] nums) {
        for(int i = 0; i<nums.length; i++){
            nums[i] = DigitSum(nums[i]);
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]<min) min = nums[i];
        }
        return min;
    }
    public int DigitSum(int n){
        int s = 0;
        while(n!=0){
            s += n%10;
            n /= 10;
        }
        return s;
    }
}