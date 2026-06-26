class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        Arrays.sort(candyType);
        int dis=1;
        for(int i=1;i<n;i++){
            if(candyType[i]!=candyType[i-1]){
                dis++;
            }
        }
        int len=n/2;
        return Math.min(dis,len);
    }
}
/*
firstly array is sorted then we traverse in array from send element and checked it with previous element if both are different then we increased the count
and after that return minimun of half of array's length and distinct
 */