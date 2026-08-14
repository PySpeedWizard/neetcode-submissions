class Solution {/*
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left =0;
        int maxFreq  = 0;
        int ans = 0;
        StringBuilder temp  = new StringBuilder();
        for(int right =0; right <  s.length(); right++){

          char ch = s.charAt(right);
           freq[ch-'A']++;
          maxFreq = Math.max(maxFreq, freq[ch-'A']);

          while((right -left+1)-maxFreq > k){
             freq[s.charAt(left)-'A']--;
             left++;
          }
          ans = Math.max(ans, right-left+1);

           // right++;
          }
          return ans;
        }

        */























          public int characterReplacement(String s, int k) {
            int[] fre = new int[26];
            int fremax = 0;
            int maxLen =0;
            int r =0;
             int l =0;
             while(r < s.length()){
              fre[s.charAt(r)-'A']++;
              fremax = Math.max( fre[s.charAt(r)-'A'],fremax);
              while((r-l+1)-fremax > k){
                 fre[s.charAt(l)-'A']--;
                 fremax =0;
                  for(int j : fre){
                   fremax = Math.max( j,fremax);
                  }
                  l+=1;
              }

    
                 maxLen = Math.max( r-l+1,maxLen);
              
              r++;
             }




          
            return maxLen;
          }
    }

