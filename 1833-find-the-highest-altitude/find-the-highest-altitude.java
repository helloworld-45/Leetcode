class Solution {
    public int largestAltitude(int[] gain) {
        int []prefix= new int[gain.length +1];
        prefix[0]=0;
        for(int i=0;i<gain.length;i++){
            prefix[i+1]=prefix[i]+gain[i];
        }
        int max =Integer.MIN_VALUE;
        for(int el:prefix){
            max=Math.max(max,el);
        }
        return max;
    }
}