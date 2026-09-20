class Solution {
    public List<List<Integer>> threeSum(int[] nums) {        List<List<Integer>> ans = new ArrayList<>();
    Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(i != 0 && nums[i] == nums[i-1]){
                continue;
            }
           
           // if(i >= nums.length) break;
            int j  = i +1;
            int k = nums.length - 1 ;
            while( j < k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum > 0){
                    k--;
                }else if(sum < 0){
                    j++;
                }else{
                    List<Integer> ds = new ArrayList<>();
                    ds.add(nums[i]);
                    ds.add(nums[j]);
                    ds.add(nums[k]);
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j-1])j++;
                    while(j < k && nums[k]== nums[k+1])k--;
                    ans.add(new ArrayList(ds));

                }

                
            }
        }
        return ans;
    }
}
