class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m= mat.length;
        int n=mat[0].length;
        if(m*n != r*c){
            return mat;
        }
        int ans[][] = new int[r][c];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                // converting into 1d array first
                int index = i *n + j; // row * no of col + col
                int nrow= index/c; // for new row index divided by no of column
                int ncol= index%c; // for new col index modulo no of column
                ans[nrow][ncol]= mat[i][j];
            }
        }
        return ans;
    }
}