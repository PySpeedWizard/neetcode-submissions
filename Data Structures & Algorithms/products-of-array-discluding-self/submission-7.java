class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        ArrayList<Integer> map = new  ArrayList<>();
        int sum  = 1;

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
        int flag = 0;
        for(int i = 0; i < nums.length;i++){
            if(nums[i] == 0 && flag != 1){
                flag =1;
                continue;
            }
            sum = sum * nums[i];
        }
        // if(sum == 0){
        //     return new int[nums.length];
        // }
        // int i =0;
        // if(zeroFlag == 1){
        //  int[] n = new int[nums.length];
        //  n[index] = sum;
        //  return n;
        // }else{
        for(int num : nums){
            map.add(num);
        }
        for(int i =0 ;i < nums.length; i++){
            if(map.contains(0) && nums[i] != 0){
              ans[i] =0 ;
            }
            if(!map.contains(0)){
                ans[i] = sum/nums[i];
            }
            if(nums[i] == 0){
                ans[i] = sum;
            }
        }
        
        return ans;
    }
}  
