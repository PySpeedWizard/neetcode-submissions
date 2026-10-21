class Solution {
    
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = 1;
        for(int i = 1; i < nums.length; i++){
            ans[i] = ans[i-1] * nums[i -1];
        }
        int prefix = 1;
        for(int i = nums.length -1; i >= 0; i--){
            ans[i]= ans[i] * prefix ;
            prefix = prefix * nums[i];
        }
        return ans;


    }
    
    // bruite force O(n^2)
    /*
    public int[] productExceptSelf(int[] nums) {
       int[] ans = new int[nums.length];
        for(int i =0 ; i < nums.length ;i++){
            int temp = 1;
            for(int j = 0 ; j < nums.length; j++){
                if(i == j)continue;
                temp *= nums[j];
            }
            ans[i] = temp;

        }
        return ans;
    }
    */
}  
