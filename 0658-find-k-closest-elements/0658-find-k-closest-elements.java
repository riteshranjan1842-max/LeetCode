class Pair implements Comparable<Pair>{
    int ele;
    int diff;
    Pair(int ele, int diff){
       this.ele = ele;
       this.diff = diff;
    }
    public int compareTo(Pair p){
        if(this.diff==p.diff)
        return Integer.compare(this.ele, p.ele);
        return Integer.compare(this.diff, p.diff);
    }
}
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
       List<Integer> ans = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : arr){
            pq.add(new Pair(ele,Math.abs(x-ele)));
            if(pq.size()>k) pq.remove();
        }
        while(pq.size()>0){
            Pair p = pq.poll();
            ans.add(p.ele);
        }
        Collections.sort(ans);
        return ans;
    }
}