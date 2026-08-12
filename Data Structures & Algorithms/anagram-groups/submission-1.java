class Solution {
   /*
    public List<List<String>> groupAnagrams(String[] strs) {
      //List<List<String>> ans = new ArrayList<>();
     // if(sts.length < 1) return  ans;
      Map<String,List<String>> map = new HashMap<>();
      for(String s : strs){
         char[] ch = s.toCharArray();
       
         Arrays.sort(ch);
         String  key = new String(ch);
         if(!map.containsKey(key)){
             map.put(key,new ArrayList());
         }
         map.get(key).add(s);
      }

   return new ArrayList<>(map.values());
    }
    */
     public List<List<String>> groupAnagrams(String[] strs) {

      Map<String,List<String>> map = new HashMap<>();
      for(String s : strs){
         int[]   fre = new int[26];
         for(int i= 0; i< s.length();i++){
            fre[s.charAt(i)-'a']++;
         }
         
         StringBuilder key = new StringBuilder();
         for(int i = 0; i< 26; i++){
            key.append('#');
            key.append(fre[i]);
         }

         map.putIfAbsent(key.toString(),new ArrayList<>());
         map.get(key.toString()).add(s);

      }
      return new ArrayList<>(map.values());
     }
}
