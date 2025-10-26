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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        for(int i=1;i<k;i++){
            temp=temp.next;
        }
        ListNode a= temp;
        ListNode b=head;

        while(temp!=null && temp.next!=null){
            temp=temp.next;
            b=b.next;
        }
        int z=a.val;
        a.val=b.val;
        b.val=z;

        return head;
        
    }
}
