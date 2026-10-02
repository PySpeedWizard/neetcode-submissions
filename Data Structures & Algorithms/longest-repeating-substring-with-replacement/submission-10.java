class Solution {
    public int characterReplacement(String s, int k) {
        int[] fre = new int[26];
        int maxlength = 0;
        int curMax = 0;
        int i = 0;
         for(int j = 0;  j < s.length(); j++){
            char ch = s.charAt(j);
            fre[ch-'A']++;
            curMax = Math.max(fre[ch-'A'],curMax);
            if((j-i+1) - curMax > k){
                fre[s.charAt(i)-'A']--;
                i++;
                curMax--;
            }
            maxlength = Math.max(maxlength,(j-i+1));


         }
         return maxlength;
    }
}
