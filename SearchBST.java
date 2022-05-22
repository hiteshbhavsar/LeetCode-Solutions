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
class SearchBST {
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Search in a Binary Search Tree.
Memory Usage: 51.7 MB, less than 12.50% of Java online submissions for Search in a Binary Search Tree.
    */
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null) return null;
        if(val==root.val)
        {
            return root;
        }
        if(val>root.val)
        {
            return searchBST(root.right,val);
        }
        else
        {
            return searchBST(root.left,val);
        }
    }
}
