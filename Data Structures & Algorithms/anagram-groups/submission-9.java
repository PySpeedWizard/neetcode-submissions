class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> hm = new HashMap<>();
        for(String s :  strs){
           int[] f = new int[26];
          
          for(int i = 0 ; i < s.length(); i++){
            f[s.charAt(i)-'a']++;
          }
         StringBuilder sb = new StringBuilder();
          for(int i  = 0; i < 26; i++){
            sb.append('#');
            sb.append(f[i]);
            sb.append('#');
          }
          hm.putIfAbsent(sb.toString(),new ArrayList());
          hm.get(sb.toString()).add(s);
           

        }
        for(List<String> list : hm.values()){
         ans.add(new ArrayList(list));
        }
        return ans;
            }
}
