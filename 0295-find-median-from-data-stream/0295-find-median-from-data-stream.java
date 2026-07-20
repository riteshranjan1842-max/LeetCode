class MedianFinder { // we are creating a DS
    PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap;
    public MedianFinder() {
       minHeap = new PriorityQueue<>();
       maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    }

    public void addNum(int num) {
      if(maxHeap.size() == 0) maxHeap.add(num);
      else{
          if(num < maxHeap.peek()) maxHeap.add(num);
          else minHeap.add(num);
      }
      if(maxHeap.size() == minHeap.size()+2)
          minHeap.add(maxHeap.poll());

      if(maxHeap.size()+2 == minHeap.size())
          maxHeap.add(minHeap.poll());


    }
    // 1 2 3 4 5 6
    public double findMedian() {
        if(maxHeap.size() == minHeap.size()+1) return maxHeap.peek();
        else if(maxHeap.size()+1 == minHeap.size()) return minHeap.peek();
        else return (maxHeap.peek() + minHeap.peek())/2.0;
    }
}

//Method 1 : TLE
// class MedianFinder { // we are creating a DS
//     ArrayList<Integer>  arr;
//     public MedianFinder() {
//         arr = new ArrayList<>();
//     }

//     public void addNum(int num) {
//        arr.add(num);
//     }
//     // 1 2 3 4 5 6 
//     public double findMedian() {
//         Collections.sort(arr);
//        int n = arr.size();
//        if(n%2==1)
//        {
//            return (double)arr.get(n/2);
//        }
//        else return (double)(arr.get(n/2-1) + arr.get(n/2))/2;
//     }
// }
/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */