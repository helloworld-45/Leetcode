class Solution {
    public int maxSum(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans=-1;
        for(int num:nums){
            int maxnum=maxDigit(num);
            if(map.containsKey(maxnum)){
                ans=Math.max(ans,map.get(maxnum)+num);
                map.put(maxnum,Math.max(map.get(maxnum),num));
            }
            else map.put(maxnum,num);
        }
        return ans;
        
    }
    public int maxDigit(int n){
        int max=0;
        while(n!=0){
            max=Math.max(max,n%10);
            n/=10;
        }
        return max;
    }
}