class Solution {
    public int subarraySum(int[] arr, int k) {
        //Prefix Sum
        int sum = 0;
        int count= 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int ele : arr){
            sum += ele;
            int target = sum-k;
            if(map.containsKey(target)) count += map.get(target);
             map.put(sum, map.getOrDefault(sum,0)+1);
            
        }
        return count;
    }
}
 // Most Optimal
    //     int n = arr.length;
    //     int left = 0, right = 0;
    //     int sum = arr[0];
    //     int count = 0;
    //     while(right<n){
    //          while (sum > k && left <= right) {
    //            sum -= arr[left];
    //            left++;
    //          }
    //           if(sum==k) count++;
    //          right++;
    //          if(right<n) sum += arr[right];
             
    //     }
    //     return count;
    // }