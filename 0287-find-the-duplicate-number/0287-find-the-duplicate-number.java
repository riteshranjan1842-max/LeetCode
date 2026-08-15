class Solution {
    public int findDuplicate(int[] arr) {
         int n = arr.length;
        int i = 0;
        while(i<arr.length){
            if(arr[i]-1==i  || arr[i]==n)  i++;
            else{
                int idx =  arr[i]-1;
                swap(arr,i,idx);
                if(arr[i]==arr[idx]) return arr[i];
            }
        }
        return n;
    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}