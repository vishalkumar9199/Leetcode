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
        ArrayList<Integer>allValue=new ArrayList<>();

        for(ListNode list:lists){
            while(list!=null){
                allValue.add(list.val);
                list=list.next;
            }
        }
        Collections.sort(allValue);

        ListNode result= new ListNode(1);
        ListNode dummy=result;

        for(int i=0;i<allValue.size();i++){
            dummy.next=new ListNode(allValue.get(i));
            dummy=dummy.next;
        }
        result=result.next;
        return result;
        
    }
}
