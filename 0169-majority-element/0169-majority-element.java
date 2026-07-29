class Solution {
    public int majorityElement(int[] nums) {
        int c = 0;
        int ele = 0;
        for(int i = 0; i<nums.length; i++){
            if(c==0){
                c = 1;
                ele = nums[i];
            }
            else if(nums[i]==ele) c++;
            else c--;
        }
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if(ele==nums[i]) count++;
        }
        return (count>nums.length/2) ? ele : -1;
    }
}