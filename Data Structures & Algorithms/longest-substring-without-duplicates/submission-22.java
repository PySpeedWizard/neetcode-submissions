class Solution {
    public int lengthOfLongestSubstring(String s) {
        // HashMap<Character, Integer> hm = new HashMap<>();
        // int j = 0;
        // int maxLen = 0;
        // for(int i = 0; i < s.length(); i++){
        //   char ch = s.charAt(i);
        //   if(hm.containsKey(ch)){
        //     j = Math.max(j,hm.get(ch));
        //   }
        //   maxLen = Math.max(maxLen, i-j+1);
        //   hm.put(ch,i+1);



        // }
        // return maxLen;

        HashMap<Character,Integer> hm = new HashMap<>();
            int j =0;
            int maxlen = 0;
            for(int i = 0; i  < s.length(); i ++){
            char ch = s.charAt(i);
            if(hm.containsKey(ch)){
            j = Math.max(j,hm.get(ch)+1);
            }
              hm.put(ch,i);
            

            maxlen= Math.max(maxlen,i-j+1);


}
return maxlen;
    }
}
