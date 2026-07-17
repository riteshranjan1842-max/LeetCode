class Triplets implements Comparable<Triplets>{
    int dist;
    int x;
    int y;
    Triplets(int dist, int x, int y) {
        this.dist = dist;
        this.x = x;
        this.y = y;
    }
    public int compareTo(Triplets t) {
        return this.dist - t.dist;
    }
}
class Solution {
    public int[][] kClosest(int[][] points, int k) {
         PriorityQueue<Triplets> pq = new PriorityQueue<>(Collections.reverseOrder());
         for(int [] point :  points) {
             int x = point[0];
             int y = point[1];
             int dist = x*x + y*y;
             pq.add(new Triplets(dist, x, y));
             if(pq.size() > k) pq.remove();
         }
         int[][] ans = new int[k][2];
         for(int i = 0; i < k; i++) {
             Triplets top = pq.poll();
             ans[i][0] = top.x;
             ans[i][1] = top.y;
         }
         return ans;
    }
}