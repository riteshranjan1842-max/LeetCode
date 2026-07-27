class Pair{
    int row;
    int col;
    Pair(int row, int col){
        this.row = row;
        this.col = col;
    }
}
class Solution {
    public void setZeroes(int[][] mat) {
        Queue<Pair> q = new LinkedList<>();
        int n = mat.length;
        int m = mat[0].length;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(mat[i][j]==0) q.add(new Pair(i,j));
            }
        }
        while(q.size()>0){
            Pair p = q.remove();
            int row = p.row;
            int col = p.col;
            for(int i = 0; i<m; i++){ // row
              mat[row][i] = 0;
            }
            for(int i = 0; i<n; i++){ // column
              mat[i][col] = 0;
            }
        }
    }
}