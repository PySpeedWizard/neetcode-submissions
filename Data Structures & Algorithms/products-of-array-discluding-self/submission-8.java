class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
  

      /*
        for(int i =0 ;i < nums.length; i++){
            int sum = 1;
            int flag =0;
            for(int j = 0 ; j< nums.length; j++){

              if(nums[j] == nums[i] && flag != 1) {
                flag = 1;
                continue;
                }
                sum = sum * nums[j];
            }
            ans[i] = sum;
        }
        */
        //optimal 

        //suffix 
        ans[0] = 1;
        for(int i = 1; i < nums.length; i++ ){
            ans[i]= ans[i-1] * nums[i-1];
        }
        // suffix
        int suffix = 1;
        for( int i = nums.length -1; i>=0; i--){
            ans[i] = ans[i]* suffix;
            suffix = suffix* nums[i];
        }
      

        
        return ans;
    }
}  
