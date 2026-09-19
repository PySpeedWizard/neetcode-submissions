class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb  = new StringBuilder();
        for(String s :  strs){
          sb.append(s.length());
          sb.append('#');
          sb.append(s);
        }
        return sb.toString();

    }

    public List<String> decode(String str) {
       List<String> an = new ArrayList<>();
        int i =0;
        while(i < str.length()){
         int j = i;
        while(str.charAt(i) != '#')i++;
        int length = Integer.parseInt(str.substring(j,i));
        an.add(str.substring(i+1,i+length+1));

        i = i+length+1;
       }
       return an;
    }
}
