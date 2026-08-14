class Solution {
    /*
    public int maxProfit(int[] prices) {
        int i = 0;
        int j =1;
        int maxProfit = 0;
        while(j < prices.length){
            int curProfit = prices[j] - prices[i];
            if(prices[j] < prices[i]){
                i =j;
                j++;
            }else{
                j++;
            }
            maxProfit = Math.max(curProfit,maxProfit);
           // j++;
        }
        return maxProfit;
    }
    */





















 public int maxProfit(int[] prices) {
    int i =0 ;
    int j =1;
    int mProfit = 0;
    while(j < prices.length){
        int curProfit = prices[j]-prices[i];
        mProfit = Math.max(mProfit, curProfit);
        if(prices[i] > prices[j]){
            i = j;
            j++;
        }else{
            j++;
        }
    }
    return mProfit;
 }

    
    

}
