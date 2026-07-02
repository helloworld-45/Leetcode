class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int left=0;
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int right=0;right<n;right++){
            sum+=nums[right];
            if((right-left+1)>k){
                sum-=nums[left];
                left++;
            }
            if((right-left+1)==k){
                maxsum=Math.max(sum,maxsum);
            }
        }
        return (double)maxsum/k;
    }
}
/*
since the question follows the pattern of fixed size slidding window and i applied its prototype and for calculating max avg i firstly calculate sum for each possible subarray then i processed the maximum sum based on fixed size slidding window prototype
and after that i simply return average of maxsum and explictly converted into double
 */