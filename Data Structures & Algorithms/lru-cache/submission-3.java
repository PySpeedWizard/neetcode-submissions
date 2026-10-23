class LRUCache {
     HashMap<Integer, Node> hm;
     Node head = new Node(-1,-1);
     Node tail = new Node(-1,-1);
     int capacity ;
   
    
    public LRUCache(int capacity) {
        hm = new HashMap<>(capacity);
          head.next = tail;
          tail.prev = head;
          this.capacity = capacity;
    }
    
    public int get(int key) {
         if(!hm.containsKey(key)){
            return -1;
         }
            Node node = hm.get(key);

            deleteAtLocation(node);
            addAtFirst(node);
            
         
       return node.val;
    }
    
    public void put(int key, int value) {
        if(capacity == 0){
            return;
        }
        if(hm.containsKey(key)){
                Node node = hm.get(key);
                node.val= value;
                hm.put(key,node);
                 deleteAtLocation(node);
                  addAtFirst(node);

    
           return;
        }

        if(hm.size() >= capacity){
            Node node = tail.prev;
            hm.remove(node.key);
            deleteAtLocation(node);
        }
           

           Node node = new Node(key,value);
           addAtFirst(node);
           hm.put(key,node);


    }
    public void addAtFirst(Node node){

        Node temp = head.next;

        head.next = node;
        node.prev = head;
        node.next = temp;
        if(temp != null) {
            temp.prev = node;
        }
    }
    // public void deleteLast(int key){
    //      Node temp = tail.prev;
    //      temp.prev.next = tail;
    //      tail.prev = temp.prev.next;
    //      hm.remove(key);
    // }
    public void deleteAtLocation(Node node){
        Node front = node.next;
        Node back = node.prev;
        
        front.prev = back;
        back.next = front;
    }
   
}
class Node{
    int key;
    int val;
    Node next;
    Node prev;
    Node(int key,int val){
      this.val = val;
      this.key = key;
    }

}
