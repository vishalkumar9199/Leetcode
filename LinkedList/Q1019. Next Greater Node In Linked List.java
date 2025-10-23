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
    public int[] nextLargerNodes(ListNode head) {
      List<Integer>list=new ArrayList<>();
      while(head!=null){
        list.add(head.val);
        head=head.next;
      }
      
      int n= list.size();
      int[]result=new int[n];
      Stack<Integer>stack=new Stack();
      for(int i=0;i<n;i++){
        while(!stack.isEmpty() && list.get(stack.peek())<list.get(i)){
            int idx=stack.pop();
            result[idx]=list.get(i);
        }
        stack.push(i);
      }
      return result;
        
    }
}
