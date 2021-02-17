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
class MinDepthofBinaryTree {
/*
Runtime: 5 ms, faster than 59.35% of Java online submissions for Minimum Depth of Binary Tree.
Memory Usage: 59.9 MB, less than 69.69% of Java online submissions for Minimum Depth of Binary Tree.

*/
    public int minDepth(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        else
            return findDepth(root);
    }
    public int findDepth(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        
        
        int right=findDepth(root.right);
        int left=findDepth(root.left);
        
        return (left == 0 || right == 0) ? Math.max(left, right)+1  : Math.min(left, right)+1;    
        //return left<right? left:right;
    }
}
