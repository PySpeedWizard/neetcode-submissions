class Solution {
    public boolean isAnagram(String s, String t) {
        int[] fre = new int[26];
        for(int i =0; i< s.length();i++){
         char ch = s.charAt(i);
         fre[ch-'a']++;
        }
        for(int i =0; i< t.length();i++){
         char ch = t.charAt(i);
         fre[ch-'a']--;
        }
        for(int i =0; i< 26;i++){
         
        if(fre[i] != 0){
         return false;
        }
        }
        return true;
    }
}
