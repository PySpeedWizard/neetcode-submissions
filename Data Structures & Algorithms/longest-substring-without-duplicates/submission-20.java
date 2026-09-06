class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int i =0;
        int j = 0;
        int maxlen = 0;
        while(j < s.length()){
            char ch = s.charAt(j);
          if(hm.containsKey(ch)){
            i = Math.max(i, hm.get(ch)+1);
          }
          maxlen = Math.max(maxlen,j-i+1);
          hm.put(ch,j);
          j++;
        }
        return maxlen;
    }
}
