class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int num : nums){
            map.put(num,1);
        }
        int maxCount =0;
        for(int num : nums){
            if(!map.containsKey(num-1)){
                int start = num;
                int count = 0;
                while(map.containsKey(num)){
                    num = num +1;
                    count++;
                }
                maxCount = Math.max(maxCount, count);
            }
        }
        return maxCount;
    }
}
