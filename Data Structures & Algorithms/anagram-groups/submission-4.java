class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        
        HashMap<String,List<String>>  hm = new HashMap<>();
        for(String s :  strs){
           
          int[] fre = new int[26];

           for(int i =0; i < s.length(); i++){
            fre[s.charAt(i)-'a']++;
           }

           StringBuilder key = new StringBuilder();
           for(int i  : fre){
            key.append('#');
            key.append(i);
            key.append('#');
           }
        
         hm.putIfAbsent(key.toString(), new ArrayList<>());

         hm.get(key.toString()).add(s);

        }

        for(List<String> list : hm.values()){
            ans.add(list);
        }
        return ans;
    }
}
