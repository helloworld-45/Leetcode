
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set= new HashSet<>();
        for(int num:nums1){
            set.add(num);
        }
        HashSet<Integer> result= new HashSet<>();
        for(int num:nums2){
            if(set.contains(num))result.add(num);
        }
        int []ans= new int[result.size()];
        int i=0;
        for(int el:result){
            ans[i++]=el;
        }
        return ans;
    }
}
/*
Approach:
1. Store all elements of nums1 in a HashSet.
2. Traverse nums2.
3. If an element exists in the HashSet, add it to the result HashSet.
4. Result HashSet automatically removes duplicates.
5. Convert the result set to an array.
Time Complexity: O(n + m)
Space Complexity: O(n)
*/


// class Solution {
//     public int[] intersection(int[] nums1, int[] nums2) {
//         Arrays.sort(nums1);
//         Arrays.sort(nums2);
//         ArrayList<Integer> ans=new ArrayList<>();
//         int i=0;
//         int j=0;
//         while(i<nums1.length && j<nums2.length){
//             if(nums1[i]==nums2[j]){
//                 if(ans.isEmpty() ||ans.get(ans.size()-1)!=nums1[i]){
//                 ans.add(nums1[i]);
//                 }
//                 j++;
//                 i++;
//             }
//             else if(nums1[i]<nums2[j]) i++;
//             else j++; 
//         }
//         int[]result=new int[ans.size()];
//         for(int k=0; k< ans.size();k++){
//             result[k]=ans.get(k);
//         }
//         return result;

//     }
// }