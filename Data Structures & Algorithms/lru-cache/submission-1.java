class LRUCache {
    private final LinkedHashMap<Integer, Integer> lru ;
    private final int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        lru = new LinkedHashMap<>(capacity,0.75f,true){
            @Override
          protected boolean removeEldestEntry(Map.Entry<Integer,Integer> eldest){
            return size() > capacity;
          }
        };
    }
    
    public int get(int key) {
        return lru.getOrDefault(key,-1);
    }
    
    public void put(int key, int value) {
        lru.put(key,value);
    }
}
