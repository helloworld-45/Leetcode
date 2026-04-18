class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n==0) return 0; 
        int k=1;
        int i=1;
        while(i<n){
           if(nums[i]==nums[k-1]){
            i++;
            continue;
           }
           else{
           nums[k]=nums[i];
           k++;
           i++;
           }
        }
        return k;
    }
}
// Two-pointer approach:
// Since array is sorted, compare each element with last unique.
// If different, place it at next position (k).
// Return k as count of unique elements.
// TC: O(n), SC: O(1)