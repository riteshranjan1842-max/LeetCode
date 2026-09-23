class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[0].length; j++){
                if(grid[i][j]<0) count++;
            }
        }
        return count;
    }
    // public int countNegatives(int[][] grid) {
    //     int count = 0;
    //     for(int i = 0; i<grid.length; i++){ 
    //         Arrays.sort(grid[i]);
            
    //     }
    //     for(int i = 0; i<grid.length; i++){
    //        count += binarySearch(grid[i]);
    //        }
    //     return count;
    // }
    // public int binarySearch(int[] grid){
    //     int low = 0, high = grid.length-1;
    //     int neg = 0;
    //     while(low <= high){
    //         int mid = (low + high)/2;
    //         if(grid[mid]<0){
    //             low = mid + 1;
    //             neg = low;
    //         } 
    //         else high = mid - 1;
    //     }
    //    return  (neg == -1) ? 0 : neg ;
    // }
}