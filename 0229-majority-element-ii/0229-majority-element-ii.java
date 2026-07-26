class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int ele : nums){
            map.put(ele, map.getOrDefault(ele,0)+1);
        }
        for(int ele : map.keySet()){
            if(map.get(ele)>n/3) ans.add(ele);
        }
        return ans;
    }
}