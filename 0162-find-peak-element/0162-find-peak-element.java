class Solution {
    public int findPeakElement(int[] arr) {
        for(int i = 0; i<arr.length; i++){
            if((i==0 || arr[i-1]<arr[i]) && (i==arr.length-1 || arr[i]>arr[i+1])) return i;
        }
        return -1;
    }
}