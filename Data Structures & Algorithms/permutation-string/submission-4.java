class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length() ) return false;
        int[] fre = new int[26];
        int[] window = new int[26];
        for(int i  = 0 ; i < s1.length();i++){
            char ch = s1.charAt(i);
            fre[ch-'a']++;
        }
        int j = 0;
        for(int i = 0; i < s2.length(); i++){
             char ch = s2.charAt(i);
              window[ch-'a']++;
              if((i-j+1) > s1.length()){
                window[s2.charAt(j)-'a']--;
                j++;
              }
              if(Arrays.equals(window,fre)) return true;
           
        }
        return false;
    }
}
