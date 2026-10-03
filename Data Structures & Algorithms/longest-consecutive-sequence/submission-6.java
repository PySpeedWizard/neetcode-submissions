class Solution {
    public int longestConsecutive(int[] nums) {
        int maxlen = 0;
        HashSet<Integer> hm = new HashSet<>();

        for(int i  : nums){
            hm.add(i);
        }
        for(int i : nums){
            if(!hm.contains(i-1)){
                int val = i;
                int count = 0;
                while(hm.contains(val)){
                    count++;
                    val+= 1;
                }
              maxlen = Math.max(maxlen,count);
            }
        }
        return maxlen;
    }
}
