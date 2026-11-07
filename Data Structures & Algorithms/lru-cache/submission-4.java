class LRUCache {
     HashMap<Integer,Node> hm ;
     int capacity  = 0;
     Node head = new Node(-1,-1);
     Node tail = new Node(-1,-1);
    public LRUCache(int capacity) {
        this.capacity = capacity;
        hm = new HashMap<>(capacity);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(hm.containsKey(key)){ 
            Node node = hm.get(key);
            int value = node.val;
            deletAtLocation(node);
            addAtFirst(node);

           return value;
        }


        return -1;
    }
    
    public void put(int key, int value) {
        if(capacity == 0) return;
        if(hm.containsKey(key)){
             Node node = hm.get(key);
             node.val = value;
             hm.put(key,node);
             deletAtLocation(node);
             addAtFirst(node);
             return;

        }
        if(hm.size() >= capacity){
            Node node = tail.prev;
            hm.remove(node.key);
            deletAtLocation(node);
        }
        Node newNode = new Node(key,value);
        hm.put(key,newNode);
        addAtFirst(newNode);
        
    }

    public void deletAtLocation(Node node){
        Node front = node.next;
        Node back = node.prev;
         front.prev = back; 
         back.next = front;
    }
    public void addAtFirst(Node node){
        Node dummy = head.next;
        head.next = node;
        node.prev = head;
        node.next = dummy;
        dummy.prev = node;
    }
}
class Node{
    Node next ;
    Node prev ;
    int val;
    int key ;
    Node(int key,int val ){
        this.val = val;
        this.key = key;
   
    }
}
