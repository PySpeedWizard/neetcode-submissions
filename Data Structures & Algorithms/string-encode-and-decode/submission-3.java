class Solution {

    public String encode(List<String> strs) {
        StringBuffer sb = new StringBuffer();

       for(String s  : strs){
         sb.append(s.length());
         sb.append('#');

         for(int i  =0 ; i < s.length(); i++){
             sb.append(s.charAt(i));
         }
       }
       return sb.toString();
    }

    public List<String> decode(String str) {
          List<String> ans = new ArrayList<>();
          int i = 0;
          while( i < str.length()){
            // char ch = str.charAt(i);
            int j = i;
            while(j < str.length() && str.charAt(j)!= '#')j++;
            int length = Integer.parseInt(str.substring(i , j ));

            ans.add(new String(str.substring(j+1,j+length+1)));
            i = j +length + 1;



          }
          return ans;
    }
}
