class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int maxl = 0;
        int i = 0;
        for(int j = 0; j < s.length(); j++ ){
            char key = s.charAt(j);
           if(hm.containsKey(key)) {
             i  = Math.max(i, hm.get(key));
           }
           hm.put(key, j+1);
           maxl = Math.max(j-i+1,maxl);

        }
        return maxl;
    }
}
