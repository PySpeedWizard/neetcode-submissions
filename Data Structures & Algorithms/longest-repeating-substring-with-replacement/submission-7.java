class Solution {
    public int characterReplacement(String s, int k) {
        int[] fre = new int[26];
        int maxLen = Integer.MIN_VALUE;
        int i =0;
         int j = 0;
           int charFre =0;
        while( j  < s.length()){
          char ch = s.charAt(j);
          fre[ch-'A']++;
          charFre = Math.max(charFre, fre[ch-'A']);
          while( (j-i+1)-charFre > k){
            fre[s.charAt(i)-'A']--;
            i++;
            charFre--;
            if(i < s.length())break;
          }
          maxLen = Math.max(maxLen,j-i+1);
          j++;

        }
        return maxLen;
    }
}
