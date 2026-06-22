class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int mincol=0;
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<matrix[i][mincol]){
                    mincol=j;
                }
            }
            int lucky = matrix[i][mincol];
            boolean islucky=true;
            for(int r=0;r<matrix.length;r++){
                if(matrix[r][mincol]>lucky){
                    islucky=false;
                    break;
                }
            }
            if(islucky){
                ans.add(lucky);
            }
        }
        return ans;
    }
}