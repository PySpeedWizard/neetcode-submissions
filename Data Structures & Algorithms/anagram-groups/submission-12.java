class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String,List<String>> hm = new HashMap<>();
        for(String s : strs){
            int[] fre = new int[26];
            for(int i = 0 ; i < s.length(); i++){
                fre[s.charAt(i)-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < 26; j++){
                sb.append('#');
                sb.append(fre[j]);
                sb.append('#');
            }
            hm.putIfAbsent(sb.toString(),new ArrayList<>());
            hm.get(sb.toString()).add(s);
            
        }
        for(List<String> ds : hm.values()){
            ans.add(new ArrayList(ds));
        }
        return ans;
    }
}
