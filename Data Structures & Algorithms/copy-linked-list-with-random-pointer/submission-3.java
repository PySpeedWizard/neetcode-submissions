/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null)return null;
        HashMap<Node,Node> hm = new HashMap<>();
        Node temp =head;
        while(temp!= null){
            hm.put(temp,new Node(temp.val));
            temp = temp.next;
        }

        temp = head;
             // Step 2: Connect next and random pointers
        temp = head;

        while (temp != null) {

            Node copy = hm.get(temp);

            copy.next = hm.get(temp.next);
            copy.random = hm.get(temp.random);

            temp = temp.next;
        }

        return hm.get(head);
    }
}
