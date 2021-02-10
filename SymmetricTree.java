/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class SymmetricTree {
/*
  Runtime: 0 ms, faster than 100.00% of Java online submissions for Symmetric Tree.
  Memory Usage: 37.3 MB, less than 47.10% of Java online submissions for Symmetric Tree.
*/
    public boolean isSymmetric(TreeNode root) {
         return root==null||checkSymetric(root.left,root.right);
    }
    public boolean checkSymetric(TreeNode root1,TreeNode root2)
    {
        if(root1==null && root2==null) return true;
        if(root1==null || root2==null) return false;
        //if(root1==root2) return true;
         return root1.val==root2.val&&checkSymetric(root1.left,root2.right) && checkSymetric(root1.right,root2.left);
    }
}
