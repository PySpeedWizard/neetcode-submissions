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
    public ListNode reverse(ListNode head){
        // if(head.next == null) return head;
        ListNode prev = null;
        ListNode  temp= head;
        ListNode next = null;
        while(temp != null){
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;

    }
    public void reorderList(ListNode head) {
        if( head == null || head.next == null) return ;
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = head;
        while(fast != null && fast.next != null ){
            slow = slow.next;
            fast= fast.next.next;
        }
        // preserve head
       
        ListNode second = reverse(slow.next);

        slow.next = null;

    
        ///step 2

        ListNode firstnext = null;
        ListNode secondnext = null;
        while(second != null){

            firstnext = temp.next;
            secondnext = second.next;


            temp.next = second;
            second.next = firstnext;

            temp = firstnext;
            second = secondnext;

        }
         




    }
}
