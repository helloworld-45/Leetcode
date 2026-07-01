class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int left=0;
        int sum=0;
        int minlength= Integer.MAX_VALUE;
        for(int right=0;right<n;right++){
            sum+=nums[right];
            while(sum>=target){
                int length=right-left+1; //we are finding length so index +1
                minlength=Math.min(length,minlength);
                sum-=nums[left]; //after processing we can remove left to keep moving our window
                left++;
            }
        }
        int result= (minlength==Integer.MAX_VALUE)?0:minlength;//it means if there are not sufficient length that can reach to target i.e target is not achieveable using the elements then return 0
        return result;
    }
}