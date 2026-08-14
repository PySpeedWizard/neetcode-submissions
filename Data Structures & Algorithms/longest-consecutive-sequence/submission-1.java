class Solution {
    public int longestConsecutive(int[] nums) {
       int maxCount = 0;
       Map<Integer,Integer>map = new HashMap<>();
       for(int i   : nums){
        map.put(i,0);
       } 

       for(int num : map.keySet())
       {
        if(!map.containsKey(num-1)){
             int count = 0;
             int temp = num;
             while(map.containsKey(temp)){
                count++;
                temp +=1;
             }
             maxCount = Math.max(maxCount, count);
        }
       }

       return maxCount;
    }
}
