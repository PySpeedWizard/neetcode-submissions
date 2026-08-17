class TimeMap {
       private HashMap<String, List<Pair>> hm;

    public TimeMap() {
        hm = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
  
            hm.putIfAbsent(key, new ArrayList<>());
            hm.get(key).add(new Pair(value, timestamp));

    }
        
    
    
    public String get(String key, int timestamp) {
        if(hm.isEmpty() || !hm.containsKey(key)) return "";
        int start  = 0;
        List<Pair> list  = hm.get(key);
        int end = list.size()-1;
        String s = "";
        while(start <= end){
            int mid = (start+end)/2;
            
            if(list.get(mid).timestamp <= timestamp){
                s = list.get(mid).value;
                start = mid + 1;
            }
             else{
                end = mid -1;
             }
        }
        return s;
        
    }
}
class Pair{
   String value;
   int timestamp;
   Pair(String value, int timestamp){
    this.value = value;
    this.timestamp = timestamp;
   }
}
