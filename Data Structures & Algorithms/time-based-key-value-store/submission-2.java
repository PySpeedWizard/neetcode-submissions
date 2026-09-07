class TimeMap {
    HashMap<String,List<Pair>> hm ;

    public TimeMap() {
        hm = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        hm.putIfAbsent(key, new ArrayList<>());
        hm.get(key).add(new Pair(value,timestamp));
    }
    
    public String get(String key, int timestamp) {
        if(!hm.containsKey(key)){
            return "";
        }
        List<Pair> obj = hm.get(key);
        int start =0;

        int end =obj.size()-1;
        String ans = "";
        while(start <= end){
            int mid = (start +end)/2;
            if(obj.get(mid).timestamp == timestamp) return obj.get(mid).value;
            if(obj.get(mid).timestamp <= timestamp){
                ans = obj.get(mid).value;
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        return ans;



    }
}
class Pair{
    int timestamp ;
    String value;
    Pair( String value, int timestamp){

        this.value = value;
        this.timestamp = timestamp;
    }
}
