class Solution {
    // public boolean hasDuplicate(int[] nums) {
    //     HashMap<Integer,Integer> hm = new HashMap<>();
    //     for(int i = 0; i < nums.length;i++){
    //         if(hm.containsKey(nums[i])) return true;
    //         hm.put(nums[i],1);
    //     }
    //     return false;
    // }
 public boolean hasDuplicate(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    for(int num : nums){
        if(set.contains(num))return true;
        set.add(num);
    }
    return false;
 }
























}








