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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res= new ListNode(Integer.MIN_VALUE);
        ListNode ptr=res;
        ListNode l1=list1;
        ListNode l2=list2;

        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                res.next=l1;
                l1=l1.next;
            }else{
                res.next=l2;
                l2=l2.next;
            }
            res=res.next;
        }
        if(l1==null){
            res.next=l2;
        }else if(l2==null){
            res.next=l1;
        }
        return ptr.next;
       
    }
}
