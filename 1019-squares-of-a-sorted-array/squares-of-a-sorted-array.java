class Solution {
    public int[] sortedSquares(int[] nums) {
        int []square= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            square[i]=nums[i]*nums[i];
        }
        int temp;
        for(int i=0;i<=square.length;i++){
            for(int j=i+1;j<square.length;j++){
            if(square[i]>square[j]){
                temp=square[i];
                square[i]=square[j];
                square[j]=temp;
            }
            }
        }
        return square;
    }
}