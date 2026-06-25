class Solution {
    public void gameOfLife(int[][] board) {
        int r=board.length;
        int c=board[0].length;
        int [][] ans= new int[r][c];
        int []dr ={-1,-1,-1,0,0,1,1,1};
        int []dc ={-1,0,1,-1,1,-1,0,1};
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int live=0;
                for(int k=0;k<8;k++){
                    int nr= i + dr[k];
                    int nc= j + dc[k];
                    if(nr>=0 && nr<r && nc>=0 && nc<c && board[nr][nc]==1){
                        live++;
                    }
                }
                // using rule provided
                if(board[i][j]==1){
                   if (live ==2 || live ==3){
                        ans[i][j]=1;
                }//no need to write extra condition for 0 since matrix element is already 0 when initialized
                }
                else{
                    if(live==3){
                        ans[i][j]=1;
                    }
                }

            }
        }
        // copying the elements from new ans array to actual array
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                board[i][j]=ans[i][j];
            }
        }
    }
}