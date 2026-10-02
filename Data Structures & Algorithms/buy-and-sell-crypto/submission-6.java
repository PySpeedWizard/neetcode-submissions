class Solution {
    public int maxProfit(int[] prices) {
        int maxp = 0;
        int j = 0;
        for(int i = 1; i  < prices.length; i++ ){
            int cur = prices[i] - prices[j];
            maxp = Math.max(cur, maxp);
            if(prices[i] < prices[j]){
               j = i;
            }
        }
        return maxp;
    }
}
