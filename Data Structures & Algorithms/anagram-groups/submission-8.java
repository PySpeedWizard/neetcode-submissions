class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
          List<List<String>>  ans = new ArrayList<>();
          HashMap<String, List<String>> hm = new HashMap<>();
          for( String s : strs){
             


             int[] fre = new int[26];
             for(int j = 0 ;  j  < s.length(); j++){
                char ch = s.charAt(j);
                fre[ch-'a']++;
             }
             StringBuffer sb = new StringBuffer();

             for(int i : fre){
               sb.append('#');
               sb.append(i);
               sb.append('#');
             }
             
             
             hm.putIfAbsent(sb.toString(),new ArrayList<>());
             hm.get(sb.toString()).add(s);
          }

          ans = new ArrayList<>(hm.values());
          return ans;

    }
}
