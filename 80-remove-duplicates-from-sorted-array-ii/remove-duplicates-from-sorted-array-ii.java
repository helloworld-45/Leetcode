class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n<=2) return n;
        int slow=2;
        for(int fast=2;fast<n;fast++){
            if(nums[fast]==nums[slow-2])continue;
            nums[slow]=nums[fast];
            slow++;
        }
        return slow;
    }
}
/*
    since the array is sorted duplicates are placed together thats why i use slow and fast pointer from index 2 since two duplicates are allowed so after 2nd duplicate i checked if duplicate occur again then i will skip that and go to next element until the end of array and i  will simply return slow pointer as it asked to return elements number placed after removal of duplicates

 */