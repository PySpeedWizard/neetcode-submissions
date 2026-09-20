class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hm = new HashSet<>();
        int maxCount =0;
        for(int i : nums){
            hm.add(i);
        }
        for(int i : hm){
           if(!hm.contains(i-1)){
              int val = i;
              int count = 0;
              while(hm.contains(val)){
                count++;
                val = val +1;
              }
              maxCount = Math.max(maxCount, count);
           }
        }

    return maxCount;
    }
}
