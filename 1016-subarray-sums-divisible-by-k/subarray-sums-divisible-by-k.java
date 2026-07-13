class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map =new HashMap<>();
        map.put(0,1);
        int count=0;
        int prefix=0;
        for(int el:nums){
            prefix+=el;
            int rem=prefix%k;
            if(rem<0)rem+=k;
            if(map.containsKey(rem)){
                count+=map.get(rem);
            }
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return count;
    }
}
/*
Approach:
- Use Prefix Sum and a HashMap to store the frequency of each prefix sum remainder (prefix % k).
- If the same remainder appears again, the subarray between those two prefix sums has a sum divisible by k.
- Add the previous frequency of the current remainder to the answer, then update its frequency in the map.
- Handle negative remainders by converting them to positive using (rem += k).
- Time Complexity: O(n)
- Space Complexity: O(k) in the average case (up to O(n) in the worst case).
*/