class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;
        while( j < prices.length){
            int curProfit = prices[j] - prices[i];
            if(prices[j]  < prices[i]) {
                i =j;
                j++;
            }else{
                j++;
            }
            maxProfit = Math.max(maxProfit,curProfit);
        }
        return maxProfit;


    }
}
