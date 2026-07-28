class Pair implements Comparable<Pair>{
    String str;
    int freq;
    Pair(String str, int freq){
        this.str = str;
        this.freq = freq;
    }
    @Override
    public int compareTo(Pair p){
        if(this.freq == p.freq) return p.str.compareTo(this.str);
        return this.freq-p.freq;
    }
}
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        List<String> list = new ArrayList<>();
        for(String str : words){
            map.put(str, map.getOrDefault(str,0)+1);
        }
        for(String key : map.keySet()){
            pq.add(new Pair(key, map.get(key)));
            if(pq.size()>k) pq.remove();
        }
        while(pq.size()>0){
            Pair p = pq.remove();
            list.add(p.str);
        }
        Collections.reverse(list);
        return list;
    }
}