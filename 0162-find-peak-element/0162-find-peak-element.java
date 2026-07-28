class Solution {
    public int findPeakElement(int[] arr) {
       // Method 2 : Binary Search
       if(arr.length==1) return 0;
       int n = arr.length;
       if(arr[0]>arr[1]) return 0;
       if(arr[n-1]>arr[n-2]) return n-1;
       int low = 1, high = n-2;
        while(low<=high){
            int mid = (low+high)/2;
            if((arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])) return mid;
            else if(arr[mid-1]<arr[mid]) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}

// Method 1 : O(n)
//  for(int i = 0; i<arr.length; i++){
//             if((i==0 || arr[i-1]<arr[i]) && (i==arr.length-1 || arr[i]>arr[i+1])) return i;
//         }
//         return -1;