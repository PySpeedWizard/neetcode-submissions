class Solution {
    public int characterReplacement(String s, int k) {
        int  longest = 0;
        int count =0;
        int[] fre = new int[26];
        int j = 0;
        for(int i = 0; i < s.length(); i++){
            fre[s.charAt(i)-'A']++;
            count = Math.max(fre[s.charAt(i)-'A'],count);

            if(j < s.length() && (i-j+1)-count > k){
                fre[s.charAt(j)-'A']--;
                count--;
                j++;
            }
            longest = Math.max(longest,i-j+1);

    

        }
        return longest;
    }
}
