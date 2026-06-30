class Solution {
    public int maxProfit(int[] prices) {
        int buystock=prices[0];
        int maxprofit=0;
        for(int price: prices){
            buystock=Math.min(buystock,price);
            int profit=price-buystock;
            maxprofit=Math.max(profit,maxprofit);
        }
        return maxprofit;
    }
}