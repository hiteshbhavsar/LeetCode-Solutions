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
class FlattenTreeToList {
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Flatten Binary Tree to Linked List.
Memory Usage: 38.7 MB, less than 19.02% of Java online submissions for Flatten Binary Tree to Linked List.
    */
private TreeNode tail = new TreeNode(-1);
    
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        
        tail.right = root;
        tail = root;
		
        var left = root.left;
        var right = root.right;
        root.left = null;
        root.right = null;
		
        flatten(left);
        flatten(right);
    }}
