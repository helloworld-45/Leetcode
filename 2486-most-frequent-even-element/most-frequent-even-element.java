class Solution {
    public int mostFrequentEven(int[] nums) {
       int[]arr=new int[100001];
       for(int el:nums){
        if(el%2==0){
            arr[el]++;
        }
       } 
       int maxfreq=0;
       int ans=-1;
       for(int i=0;i<arr.length;i+=2){
        int freq=arr[i];
        if(freq>maxfreq){
            maxfreq=freq;
            ans=i;
        }
        else if(freq==maxfreq && maxfreq!=0 && i<ans)ans=i;
       }
       return ans;
    }
}
/*
Sort the array so that equal elements become consecutive. Traverse the sorted
array and count the frequency of each even number. Keep track of the highest
frequency seen so far and the corresponding even number. Since the array is
sorted, if two even numbers have the same frequency, the smaller one is
encountered first, so it naturally becomes the answer. If no even number
exists in the array, return -1.
*/