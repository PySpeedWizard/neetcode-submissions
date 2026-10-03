class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        for(String s : strs){
          
          int[] fre = new int[26];
          for(int i = 0; i < s.length(); i++ ){
            fre[s.charAt(i)-'a']++;
          }
          StringBuffer sb = new StringBuffer();
          for(int i =0; i < 26; i++){
            sb.append('#');
            sb.append(fre[i]);
            sb.append('#');
          }
          hm.putIfAbsent(sb.toString(),new ArrayList<>());
          hm.get(sb.toString()).add(s);
      
        }
        for(List<String> ds :  hm.values()){
              ans.add(new ArrayList(ds));
        }
        return ans;
    }
}
