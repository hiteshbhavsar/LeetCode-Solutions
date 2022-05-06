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
class TrimBST {
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Trim a Binary Search Tree.
Memory Usage: 45.5 MB, less than 7.67% of Java online submissions for Trim a Binary Search Tree.
    */
    
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root==null)
        {
            return null;
        }
        
        if(root.val<low)
        {
            return trimBST(root.right,low,high);
        }
        else if(root.val>high)
        {
            return trimBST(root.left,low,high);
        }
        
        root.left=trimBST(root.left,low,high);
        root.right=trimBST(root.right,low,high);
        return root;
    }
}
