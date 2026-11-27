class Solution {
    public boolean isPalindrome(String s) {
        int i =0;
        int j = s.length()-1;
        while(i <= j){
            while(i <= j && !Character.isLetterOrDigit(s.charAt(j))) j--;
            while(i <= j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            if(i < j && Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
              return false;
            i++;
            j--;

        }
        return true;
    }
    public boolean check(char ch){
        if(ch <= 'z' || ch >= 'a') return true;
        if(ch <= 'A'  ||ch >= 'Z') return true;
        if(ch <= '0' || ch >= '9') return true;
        return false;
    }
}
