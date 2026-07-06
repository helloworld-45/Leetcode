// class Solution {
//     public boolean isMiddleElementUnique(int[] nums) {
//        int n=nums.length;
//        HashMap<Integer,Integer> map= new HashMap<>();
//        for(int el:nums){
//         map.put(el,map.getOrDefault(el,0)+1);
//        } 
//        return map.get(nums[n/2])==1;
//     }
// }
// Count the frequency of each element using a HashMap.
// If the middle element appears only once, return true; otherwise, return false.
// time: O(n) , space=O(n)


class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int middle = nums[nums.length / 2];
        int count = 0;
        for (int num : nums) {
            if (num == middle) {
                count++;
            }
        }
        return count == 1;
    }
}
//brute for technique
// time: O(n) , space=O(1)