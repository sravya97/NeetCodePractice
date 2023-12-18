class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buyPrice = Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++){
            if(prices[i] < buyPrice){
                buyPrice = prices[i];
            }
            if(prices[i] - buyPrice > profit){
                profit = prices[i] - buyPrice;
            }
        }
        return profit;
        
    }
}