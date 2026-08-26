class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String,List<String>> hm = new HashMap<>();
        for(String s : strs){

             int[] fre = new int[26];
             for(int j =0; j< s.length();j++){
               char ch = s.charAt(j);
               fre[ch-'a']++;
             }
             StringBuffer key = new StringBuffer();
             for(int k =0; k < 26; k++){
               key.append('#');
               key.append(fre[k]);
             }

             hm.putIfAbsent(key.toString(),new ArrayList<>());

             hm.get(key.toString()).add(s);
        }

        for(List<String> sn : hm.values()){
         ans.add(new ArrayList<>(sn));
        }
        return ans;
    }
}
