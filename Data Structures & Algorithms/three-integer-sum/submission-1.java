class Solution {
    /*
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
   Arrays.sort(nums);
      //  int i = 0;
        for(int i =0 ; i<nums.length; i++){
            if(i != 0 && nums[i] == nums[i-1]){
                continue;
            }
            int j = i+1; 
            int k = nums.length-1;

            while(j < k){

                int sum = nums[i]+ nums[j]+ nums[k];

                if(sum > 0){
                    k--;
                }
                else if( sum < 0){
                    j++;
                }
                else{
                  List<Integer> ds = new ArrayList<>();
                  
                  ds.add(nums[i]);
                  ds.add(nums[j]);
                  ds.add(nums[k]);
                  ans.add(new ArrayList<>(ds));
                  j++;
                  k--;
                  while(j < k && nums[j] == nums[j-1]) j++;
                  while( j< k && nums[k] == nums[k+1]) k--;
                }

            }
        }
    
return ans;
        }
        */






















    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i< nums.length; i++){
            if(i != 0 && nums[i] == nums[i-1]) continue;

            if(i == nums.length) break;

            int start = i+1;
            int end  = nums.length-1;

            while(start < end){
                int sum = nums[i]+nums[start]+nums[end];
                if(sum > 0){
                    end--;
                }
                else if(sum < 0){
                    start++;
                }else{
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[start]);
                    temp.add(nums[end]);
                    ans.add(temp);
                    start++;
                    end--;
                    while(start < end && nums[start]== nums[start-1])start++;
                     while(start < end && nums[end]== nums[end+1])end--;

                }
            }
            
        }
        return ans;
    }
}

