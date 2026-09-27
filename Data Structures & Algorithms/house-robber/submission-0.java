class Solution {
    public int rob(int[] nums) {
       int[] dp = new int[nums.length+1];
        Arrays.fill(dp,-1);

        return min(nums.length,nums, dp);
    }
    public int min(int index ,int[] nums, int[] dp){
        if(index == 0) return 0;
        if(index ==1) return nums[0];

        if(dp[index] != -1) return dp[index];
        int left = min(index-2,nums,dp)+nums[index-1];
        int right = min(index-1,nums,dp)+0;
        return dp[index] = Math.max(left,right);
    }
}
