class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int max=0;
        int zeros=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0)zeros++;
            while(zeros>k){
                if(nums[left]==0)zeros--;
                left++;
            }
            max = Math.max(max,right-left+1);
        }
        return max;
    }
}
// Sliding window approach: expand the window by moving the right pointer and count the number of zeros.
// If the number of zeros exceeds k, shrink the window from the left until it becomes valid again.
// At each step, update the maximum length of the valid window.