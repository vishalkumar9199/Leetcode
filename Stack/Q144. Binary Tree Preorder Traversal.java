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
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null) return new ArrayList<>();
        List<Integer>result=new ArrayList<>();

        class Traverse{
            Traverse(TreeNode currNode){
                result.add(currNode.val);

                if(currNode.left!=null){
                    new Traverse(currNode.left);
                }
                if(currNode.right!=null){
                    new Traverse(currNode.right);
                }
            }
        }
        new Traverse(root);
        return result;

        
    }
}
