class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        Arrays.sort(nums);
        int longest=1;
        int curr=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i])continue;
            if(nums[i]==nums[i-1]+1){
                curr++;
            }
            else{
                longest=Math.max(longest,curr);
                curr=1;
            }
        }
        return Math.max(curr,longest); //if the input is already in a sequence then else part will not be executed
    }
}