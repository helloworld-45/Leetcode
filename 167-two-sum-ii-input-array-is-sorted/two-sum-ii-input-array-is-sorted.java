class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ind1 =0;
        int ind2=numbers.length-1;
        while(ind1<=ind2){
            if(numbers[ind1]+numbers[ind2]==target){
                return new int[]{ind1+1,ind2 +1};
            }
            else if(numbers[ind1]+numbers[ind2]>target) ind2--;
            else ind1++;
        }
        return new int[]{-1,-1};
    }
}