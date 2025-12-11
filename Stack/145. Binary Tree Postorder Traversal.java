/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null) return new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        class Traverse{
            Traverse(TreeNode currNode){
                if(currNode.left!=null){
                   new Traverse(currNode.left);
                }
                if(currNode.right!=null){
                    new Traverse(currNode.right);
                }
                list.add(currNode.val);
            }
        }
        new Traverse(root);
        return list;

        
    }
}
