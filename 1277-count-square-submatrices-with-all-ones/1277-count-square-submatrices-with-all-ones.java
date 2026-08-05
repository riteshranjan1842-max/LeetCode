class Solution {
    public int countSquares(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int count = 0;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                 if(mat[i][j]==1 && i>0 && j>0){
                    mat[i][j] += Math.min(mat[i-1][j-1], Math.min(mat[i-1][j], mat[i][j-1]));
                }
                count += mat[i][j];
            }
        }
        return count;
    }
}