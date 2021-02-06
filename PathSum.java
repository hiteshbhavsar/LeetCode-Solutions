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
class PathSum {
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Path Sum.
Memory Usage: 39.2 MB, less than 35.65% of Java online submissions for Path Sum.
*/
    public boolean hasPathSum(TreeNode root, int sum) {
      if(root==null && sum==0)
          return false;
      else
          return checkSumofPath(root,sum);
    }
    
    public boolean checkSumofPath(TreeNode root, int sum)
    {        
        if(root==null)
            return false;
        if (root.left == null && root.right == null) return sum == root.val;
        
        return checkSumofPath(root.left,sum-root.val)||checkSumofPath(root.right,sum-root.val);

    }
}
