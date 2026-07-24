class Solution {
   
    public boolean checkInclusion(String s1, String s2) {
        int left = 0;
        int right = 0;
        int[] feq = new int[26];
        int[] window = new int[26];
        if(s1.length() > s2.length()) return false;

        for(int i = 0; i< s1.length() ;i++){
             char ch = s1.charAt(i);
             feq[ch-'a']++;
        }
    
        while( right < s2.length()){
             char ch = s2.charAt(right);

             window[ch-'a']++;

             if(right - left +1 > s1.length()){
                window[s2.charAt(left)-'a']--;
                left++;
             }


            if(Arrays.equals(window, feq)) return true;
            right++;
        }
        return false;
    }
    
    
}

