class LRUCache {
    int capacity ;
   LinkedHashMap<Integer, Integer> hm;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        hm = new LinkedHashMap<>(capacity, 0.7f, true);
    }
    
    public int get(int key) {
        return hm.getOrDefault(key,-1);
    }
    
    public void put(int key, int value) {
        hm.put(key,value);
        if(hm.size() > capacity){
            int lrukey = hm.keySet().iterator().next();
            hm.remove(lrukey);

        }
    }
}
