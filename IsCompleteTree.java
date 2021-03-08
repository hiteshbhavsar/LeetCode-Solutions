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
class IsCompleteTree {
    public boolean isCompleteTree(TreeNode root) {
        /*
        Runtime: 1 ms, faster than 68.10% of Java online submissions for Check Completeness of a Binary Tree.
        Memory Usage: 38.2 MB, less than 82.01% of Java online submissions for Check Completeness of a Binary Tree.
        */
        if (root == null)
            return true;
        boolean found = false;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            if (curr == null)
                found = true;
            else {
                if (found)
                    return false;
                q.add(curr.left);
                q.add(curr.right);
            }
        }
        return true;
    }
}
