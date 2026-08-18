class LRUCache {
    LinkedHashMap<Integer,Integer> map;

    public LRUCache(int capacity) {
        map = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > capacity;
            }
        };
    }
    
    public int get(int key) {
        if(map.containsKey(key)) return map.get(key);
        return -1;
    }
    
    public void put(int key, int value) {

      map.put(key,value);
        
    }
}
