class Pair implements Comparable<Pair>{
    int ele;
    int freq;
    Pair(int ele, int freq){
        this.ele = ele;
        this.freq = freq;
    }
    public int compareTo(Pair p){
        if(this.freq==p.freq) return p.ele-this.ele;
        return this.freq - p.freq;
    }

}
class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : nums){
            if(ele%2==0) map.put(ele, map.getOrDefault(ele,0)+1);
        }
        if(map.size()==0) return -1;
        for(int key : map.keySet()){
            pq.add(new Pair(key, map.get(key)));
        }
        return pq.remove().ele;
    }
}