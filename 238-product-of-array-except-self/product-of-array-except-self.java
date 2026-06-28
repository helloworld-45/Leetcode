class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int []ans= new int[n];
        ans[0]=1;
        //firstly left side products
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]*nums[i-1];
        }
        // now left product into right product
        int rightproduct=1;
        for(int i=n-1;i>=0;i--){
            ans[i]*=rightproduct;
            rightproduct*=nums[i];
        }
        return ans;
    }
}
//at first i created a prefix array for storing left side products then i created a rightproduct variable that multiplies everytime with its left side using ans arr to obtain the final result so for this i traversed from right side