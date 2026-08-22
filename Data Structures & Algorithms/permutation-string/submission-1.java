class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length())return false;
        int[] fre = new int[26];
        int[] window = new int[26];
        for(int i =0 ;i < s1.length() ; i++){
            fre[s1.charAt(i)-'a']++;
        }
    
        int i =0;
        int j =0;
        while (j < s2.length()){
            window[s2.charAt(j)-'a']++;
            if(j-i+1 > s1.length()){
               window[s2.charAt(i)-'a']--; 
               i++;   
            }
            if(Arrays.equals(window,fre))return true;
            j++;
       
        }
        return false;
        

    }
}
