class Pair implements Comparable<Pair>{
    String s;
    int length;
    Pair(String s, int length){
        this.s = s;
        this.length = length;
    }
    @Override
    public int compareTo(Pair p){
        if(this.length == p.length){
         return this.s.compareTo(p.s);
        }
        return Integer.compare(this.length, p.length);
    }
}
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int i = 0; i<nums.length; i++){
            pq.add(new Pair(nums[i], nums[i].length()));
            if(pq.size()>k) pq.remove();
        }
        return pq.remove().s;
    }
}