class Solution {
    public int lengthOfLongestSubstring(String s) {
       int[] map = new int[257];
       int left =0;
       int right =0;
       int maxLen =0;
       Arrays.fill(map, -1);
       
       while( right < s.length()){
        char ch = s.charAt(right);

        if(map[ch] >= left){
          left = Math.max(left, map[ch]+1);
        }

        maxLen = Math.max(maxLen, right-left+1);

        map[ch] = right;
        right++;
       }
        
       return maxLen;
    }
}
