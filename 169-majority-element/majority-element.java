class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int candidate=0;
        int count=0;
        for(int el:nums){
            if(count==0){
                candidate=el;
            }
            if(candidate==el){
                count++;
            }
            else count --;
        }
        return candidate;
    }
}
// class Solution {
//     public int majorityElement(int[] nums) {
//         int n=nums.length;
//         HashMap<Integer,Integer> map =new HashMap<>();
//         for(int el:nums){
//             map.put(el,map.getOrDefault(el,0)+1);
//             if(map.get(el)>n/2)return el;
//         }
//         return -1;
//     }
// }
//using Hashmap technique whose time complexity is O(log(n))

// class Solution {
//     public int majorityElement(int[] nums) {
//         int n=nums.length;
//         Arrays.sort(nums);
//         return nums[n/2];
//     }
// }
// using sorting technique, time complexity is O(nlogn)