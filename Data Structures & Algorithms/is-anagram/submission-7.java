class Solution {
    public boolean isAnagram(String s, String t) {
      int[] fre = new int[26];
      for(int i = 0   ; i  < s.length(); i++){
        char ch = s.charAt(i);
        fre[ch-'a']++;
      }
      for(int  j =0; j < t.length();j++){
        char ch = t.charAt(j);
        fre[ch-'a']--;

      }
      for(int i  = 0; i <26; i++){
         if(fre[i] != 0){
            return false;
         }
      }
      return true;

    }
}
