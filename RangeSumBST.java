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
class RangeSumBST {
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Range Sum of BST.
Memory Usage: 67.6 MB, less than 25.64% of Java online submissions for Range Sum of BST.
*/
   private int totalSum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum(root, low, high);
        
        return totalSum;
    }
    
    private void sum(TreeNode root, int low, int high) {
        if (root == null)
            return;
        
        if (root.val >= low && root.val <= high)
            totalSum += root.val;
        
        if (root.val > low)
            sum(root.left, low, high);
        
        if (root.val < high)
            sum(root.right, low, high);
    }
   
}
