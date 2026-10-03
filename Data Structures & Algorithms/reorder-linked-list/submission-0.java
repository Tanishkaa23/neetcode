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
    public void reorderList(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        //mid point
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //divide into 2 halves
        ListNode secondHalf = slow.next;
        slow.next = null;

        ListNode prev = null;
        ListNode curr = secondHalf;
        
        //reverse the seconf half
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        secondHalf = prev;

        ListNode firstHalf = head;

        while(secondHalf != null){
            ListNode temp1 = firstHalf.next;
            ListNode temp2 = secondHalf.next;
            firstHalf.next = secondHalf;
            secondHalf.next = temp1;

            firstHalf = temp1;
            secondHalf = temp2;
        }
        

    }
}
