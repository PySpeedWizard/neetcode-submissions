class Solution {
    public int characterReplacement(String s, int k) {
      int i = 0;
      int j = 0;
      int maxLen = 0;
      int maxFre = 0;
    
      int[] fre = new int[26];
      while(j < s.length()){
        char ch = s.charAt(j);
        fre[ch-'A']++;
        maxFre = Math.max(maxFre ,fre[ch-'A']);
        while((j-i+1) - maxFre > k){
          fre[s.charAt(i)-'A']--;
          i++;
        }
        maxLen = Math.max(maxLen,j-i+1);
        j++;
    }
    return maxLen;
        
    }
}
