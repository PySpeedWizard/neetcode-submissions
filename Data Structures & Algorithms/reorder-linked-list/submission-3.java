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
        if(head == null ||head.next == null) return head;
        ListNode temp = head;
        ListNode prev = null;
        while(temp != null){
            ListNode second = temp.next;
            temp.next = prev;
            prev = temp;
            temp = second;
            
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        if(head == null || head.next == null)return ;
        ListNode slow = head;
        ListNode fast = head;
  
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode slowNext = reverseList(slow.next);
        slow.next = null;
        slow = head;
        while(slowNext != null){
            ListNode slowfront = slow.next;
            ListNode slowNextfront = slowNext.next;

              
            slow.next = slowNext;
            slowNext.next = slowfront;



          

            slow = slowfront;
            slowNext = slowNextfront;
            


        }
     
        
    }
}
