class Solution {
    public int minStartValue(int[] nums) {
        int sum=0;
        int minprefix=0;
        for(int el:nums){
            sum+=el;
            minprefix=Math.min(minprefix,sum);
        }
        return 1-minprefix;
    }
}