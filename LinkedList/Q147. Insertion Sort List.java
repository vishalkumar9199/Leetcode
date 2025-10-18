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
    public ListNode insertionSortList(ListNode head) {
       if (head == null || head.next == null) return head;

        // Dummy node for the sorted list
        ListNode dummy = new ListNode(0);
        ListNode curr = head;

        while (curr != null) {
            // Save the next node before re-linking
            ListNode next = curr.next;

            // Find the right position to insert current node
            ListNode prev = dummy;
            while (prev.next != null && prev.next.val < curr.val) {
                prev = prev.next;
            }

            // Insert current node after prev
            curr.next = prev.next;
            prev.next = curr;

            // Move to next node in original list
            curr = next;
        }
          return dummy.next;
    }
      
        
    
}
