class Pair implements Comparable<Pair>{
    int val;
    int freq;
    Pair(int val, int freq){
        this.val = val;
        this.freq = freq;
    }
    public int compareTo(Pair p){
        if(this.freq==p.freq) return p.val-this.val;
        return this.freq - p.freq;
    }
}
class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int ele : nums){
            map.put(ele, map.getOrDefault(ele,0)+1);
        }
        for(int key : map.keySet()){
            pq.add(new Pair(key, map.get(key)));
        }
        int idx = 0;
        while(pq.size()>0){
            Pair p = pq.remove();
            int val = p.val;
            int freq = p.freq;
            while(freq>0){
                nums[idx++] = val;
                freq--;
            }
        }
        return nums;
    }
}