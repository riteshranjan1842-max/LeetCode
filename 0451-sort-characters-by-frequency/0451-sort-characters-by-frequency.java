class Pair implements Comparable<Pair>{
    char ch; 
    int freq;
    Pair(char ch, int freq){
        this.ch = ch;
        this.freq = freq;
    }
    public int compareTo(Pair p){
        return this.freq-p.freq;
    }
}
class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder str = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(char ch : map.keySet()){
            pq.add(new Pair(ch, map.get(ch)));
        }
        while(pq.size()>0){
            Pair p = pq.remove();
            char ch = p.ch;
            int freq = p.freq;
            for(int i = 0; i<freq; i++) {
                str.append(ch);
            }
        }
        return str.toString();
    }
}