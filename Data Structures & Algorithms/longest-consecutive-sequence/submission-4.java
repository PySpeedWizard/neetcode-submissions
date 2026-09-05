class Solution {
    public int longestConsecutive(int[] nums) {
        int max =0;
        HashSet<Integer> hm = new HashSet<>();
        for( int i : nums){
            hm.add(i);
        }
        for(int i : nums){
            if(!hm.contains(i -1)){
                int num = i;
                int curMax = 0;
                while(hm.contains(num)){
                    num = num+1;
                    
                     curMax++; 
                }
                max = Math.max(max, curMax);

            }
        }
        return max;
    }
}
