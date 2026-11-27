class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0;
        HashSet<Integer> hm = new HashSet<>();
        for(int i : nums){
            hm.add(i);
        }
        for(int i = 0;  i < nums.length; i++){
            if(!hm.contains(nums[i]-1)){
                int count = 0;
                int val = nums[i];
                while(hm.contains(val)){
                   count++;
                   val += 1;
                }
                max = Math.max(max,count);
            }
        }
        return max;
    }
}
