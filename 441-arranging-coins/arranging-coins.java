class Solution {
    public int arrangeCoins(int n) {
        long low=0;
        long high=n;
        long ans=0;
        while(low<=high){
            long r = low + (high - low)/2 ;
            long m=r*(r+1)/2 ;
            if(m==n) return (int)r;
            else if(m>n) high=r-1;
            else{
                ans=r;
                low=r + 1;
            } 
        }
        return (int)ans;
    }
}