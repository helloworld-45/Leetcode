class Solution {
    public int maximizeSum(int[] nums, int k) {
        int n=nums.length;
        int max=nums[0];
        int maxsum=0;
        for(int el:nums){
            max=Math.max(el,max);
        }
        for(int i=0;i<k;i++){
            maxsum+=max++;
        }
        return maxsum;
    }
}