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
    public ListNode reverseBetween(ListNode head, int left, int right) {
       ListNode dummy = new ListNode(0);
       dummy.next=head;

       ListNode leftpre=dummy;
       ListNode temp=head;

       for(int i=0;i<left-1;i++){
        leftpre=leftpre.next;
        temp=temp.next;
       }

       ListNode subListedHead=temp;
       ListNode before=null;

       for(int i=0;i<=right-left;i++){
        ListNode after=temp.next;
        temp.next=before;
        before=temp;
        temp=after;
       }

       leftpre.next=before;
       subListedHead.next=temp;

       return dummy.next;

    }

}
