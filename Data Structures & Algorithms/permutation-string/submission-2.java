class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int[] freqS1 = new int[26];
        for(int i =0; i < s1.length();i++){
            freqS1[s1.charAt(i)-'a']++;
        }
        int[] window = new int[26];
        int i =0;
        for(int j = 0; j< s2.length();j++){
            window[s2.charAt(j)-'a']++;
            if((j-i+1) > s1.length()){
                 window[s2.charAt(i)-'a']--;
                 i++;
            }
            if(Arrays.equals(freqS1,window))return true;

        }
        return false;

    }
}
