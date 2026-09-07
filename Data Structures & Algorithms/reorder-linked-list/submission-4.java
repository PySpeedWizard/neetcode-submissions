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
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode temp = head;
        while(temp != null){
            ListNode next = temp.next;
            temp.next = pre;
            pre = temp;
            temp = next;
        }
        return pre;
    }
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while( fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondhead = reverseList(slow.next);
        slow.next = null;

        slow = head;
        
        while(secondhead != null){
            ListNode slownext = slow.next;
            ListNode secondheadnext = secondhead.next;

            slow.next = secondhead;
            secondhead.next =  slownext;
            
            slow = slownext;
            secondhead = secondheadnext;
        }
      

    }
}
