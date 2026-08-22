class Solution {
    public int lengthOfLongestSubstring(String s) {
      
        int[] fre = new int[256];
        HashMap<Character, Integer> hm = new HashMap<>();
      int i = 0;
      int j =0;
      int longSubStr = 0;
      while(j < s.length()){

         // if(fre[s.charAt(j)] != 0){
         //    while(s.charAt(i) != s.charAt(j))i++;
         //    i = i +1;
         // }
         // else{
         //    fre[s.charAt(j)]++;
            
         // }

         char ch = s.charAt(j);
         if(hm.containsKey(ch)){
            i  = Math.max(i, hm.get(ch)+1);
         }
         hm.put(ch, j);
         longSubStr = Math.max(longSubStr, j-i+1);
        j++;

      }
      return longSubStr;
    }
}
