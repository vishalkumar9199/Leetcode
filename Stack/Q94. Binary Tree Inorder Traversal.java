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
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null) return new ArrayList<>();
        List<Integer>result=new ArrayList<>();
		
		class Traverse{
			Traverse(TreeNode currentNode){
				if(currentNode.left!=null) {
				new Traverse(currentNode.left);
				}
				result.add(currentNode.val);			
				if(currentNode.right!=null) {
					new Traverse(currentNode.right);
				}
				

			}
		}
		new Traverse(root);
		return result;
    }
}
