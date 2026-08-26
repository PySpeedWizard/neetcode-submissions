class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i =0;

        int maxLen = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int j =0;j < s.length();j++){
         char ch = s.charAt(j);
            if(hm.containsKey(ch)){
               i = Math.max(i, hm.get(ch)+1);
            }
               hm.put(ch, j);
            
            maxLen = Math.max(maxLen, j-i+1);


 
        }
        return maxLen;
    }
}
