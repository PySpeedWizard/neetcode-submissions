/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
       if(lists  == null || lists.length == 0) return null;
       
        List<Integer> list = new ArrayList<>();
       for(int i =0; i < lists.length ; i++){
         ListNode  node = lists[i];
         while(node != null){
            list.add(node.val);
            node = node.next;
         }
       }


       Collections.sort(list);

       ListNode  head = new ListNode(list.get(0));
       ListNode tempNode = head;
       for(int i = 1 ; i < list.size() ;i++){
         ListNode newNode = new ListNode(list.get(i));
         tempNode.next = newNode;
         tempNode = newNode;
       }
       return head;
    }
}
