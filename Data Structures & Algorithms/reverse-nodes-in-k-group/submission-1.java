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
    
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        ListNode temp = head;
        ArrayList<Integer> list= new ArrayList<>();
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }

        for( int i =0; i < list.size(); i++){
            int start = i;
            int end = i + k -1;
            if(end < list.size()){
                reverse(list,start,end);
                i=i+k-1;
            }
        
        }

        ListNode newHead = new ListNode(list.get(0));
        temp = newHead;
        for(int i=1; i< list.size();i++){
            ListNode node = new ListNode(list.get(i));
            temp.next = node;
            temp = node;
            
        }
     return newHead;


       
    }
    public static void  reverse(ArrayList<Integer> list , int start , int end){
        while(start < end){
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }
}
