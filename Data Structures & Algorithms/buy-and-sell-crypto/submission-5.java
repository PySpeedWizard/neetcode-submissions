class Solution {
    public int maxProfit(int[] prices) {
        int mxp = 0;
        int i = 0;
        int j = 0;
        while(j < prices.length){
            int curP = prices[j]- prices[i];
            mxp = Math.max(curP,mxp);
            if(prices[i] > prices[j]){
                i++;
            }else{
                j++;
            }
         
            
        }
        return mxp;
    }
}
