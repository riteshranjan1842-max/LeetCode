class Pair implements Comparable<Pair>{
     int key;
     int val;
     Pair(int key, int val){
        this.key = key;
        this.val = val;
     }
     public int compareTo(Pair p){
        if(this.val == p.val) return this.key-p.key;
        return this.val - p.val;
     }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[k];
        for(int ele : nums){
            map.put(ele, map.getOrDefault(ele,0)+1);
        }
        for(int ele : map.keySet()){
            pq.add(new Pair(ele, map.get(ele)));
            if(pq.size()>k) pq.remove();
        }
        for(int i = 0; i<k; i++){
            Pair p = pq.remove();
            ans[i] = p.key;
        }
        return ans;
    }
}