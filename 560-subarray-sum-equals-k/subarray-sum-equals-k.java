class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
              sum+=nums[j];
              if(sum==k) count++;  
            }
        }
        return count;
    }
}
// this is basic bruteforce technique with time complexity O(n2) , gonna solve it later with running prefix sum + hashmap