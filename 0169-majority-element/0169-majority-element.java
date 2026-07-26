class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
       HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : nums){
            map.put(ele, map.getOrDefault(ele,0)+1);
        }
        for(int ele : map.keySet()){
            if(map.get(ele)>n/2) return ele;
        }
        return -1;
    }
}