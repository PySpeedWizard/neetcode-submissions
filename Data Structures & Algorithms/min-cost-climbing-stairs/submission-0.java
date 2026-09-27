class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+1];
        Arrays.fill(dp,-1);

        return min(cost.length,cost, dp);
    }
    public int min(int index ,int[] cost, int[] dp){
        if(index == 0) return 0;
        if(index == 1) return 0;

        if(dp[index] != -1) return dp[index];
        int left = min(index-1,cost,dp)+cost[index-1];
        int right = min(index-2,cost,dp)+cost[index-2];
        return dp[index] = Math.min(left,right);
    }
}
