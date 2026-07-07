class Solution {
    public int mostFrequent(int[] nums, int key) {
        int []freqarr=new int[1001];
        int ans=0;
        int max=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==key){
                int target=nums[i+1];
                freqarr[target]++;
                if(freqarr[target]>max){
                    max=freqarr[target];
                    ans=target;
                }
            }
        }
        return ans;
    }
}