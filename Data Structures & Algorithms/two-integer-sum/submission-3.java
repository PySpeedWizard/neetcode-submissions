class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int f = target - nums[i];
            if(hm.containsKey(f)){
                return new int[]{hm.get(f),i};
            }
            hm.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
