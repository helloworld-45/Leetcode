class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int base=0;
        for(int i=0;i<customers.length;i++){
            if(grumpy[i]==0){
                base+=customers[i];
            }
        }
        int extra=0;
        int extramax=0;
        int left=0;
        for(int right=0;right<customers.length;right++){
            if(grumpy[right]==1){
                extra+=customers[right];
            }
            if((right-left+1)>minutes){
                if(grumpy[left]==1){
                    extra-=customers[left];
                }
                left++;
            }
            extramax=Math.max(extra,extramax);
        }
        return extramax+base;
    }
}
// First count all customers who are already satisfied when the owner is not grumpy.
// Then use a fixed-size sliding window of length 'minutes' to find the best consecutive
// interval where making the owner not grumpy would satisfy the maximum additional customers.
// Keep updating the current window's contribution, track the maximum one, and finally add it
// to the customers who were already satisfied.