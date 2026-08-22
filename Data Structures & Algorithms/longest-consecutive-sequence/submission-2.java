class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int longCon = 0;
        for(int num : nums){
            set.add(num);
        }
        for(int num: nums){
           if(!set.contains(num-1)){
             int cur = num;
             int count =0;
             while(set.contains(cur)){
                count++;
                cur = cur+1;
             }
             longCon = Math.max(longCon,count);
           }
           
        }
        return longCon;
    }
}
