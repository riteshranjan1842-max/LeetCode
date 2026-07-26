class Solution {
    public int maximumProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
            if((nums[i])>=max){
                max3 = max2;
                max2 = max;
                max = nums[i];
            }
            else if((nums[i])>=max2 && (nums[i])!=max)
            {max3 = max2;
               max2 = nums[i];
            }
            else if((nums[i])>=max3 && (nums[i])!=max2){
                    max3 = nums[i];
            }
        }
        for(int i = 0; i<nums.length; i++){
            if((nums[i])<=min){
                min2 = min;
               min = nums[i];
            }
            else if((nums[i])<=min2 && (nums[i])!=min)
            {
               min2 = nums[i];
            }
        }
        int p = min*min2*max;
        int q = max*max2*max3;
        return (p>q)?p:q;
    }
}