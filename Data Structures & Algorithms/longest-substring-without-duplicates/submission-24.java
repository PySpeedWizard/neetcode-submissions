class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int j = 0;
        int lsub = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(hm.containsKey(ch)){
                j = Math.max(hm.get(ch),j);
            }
            hm.put(ch,i+1);
           lsub = Math.max(lsub,i-j+1);
        }
        return lsub;
    }
}
