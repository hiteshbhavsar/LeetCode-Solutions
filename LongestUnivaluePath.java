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
class LongestUnivaluePath {
    /*
    Runtime: 2 ms, faster than 94.42% of Java online submissions for Longest Univalue Path.
    Memory Usage: 42.7 MB, less than 32.87% of Java online submissions for Longest Univalue Path.
    */
    int max=0;
    public int longestUnivaluePath(TreeNode root) {
        recur(root);
        return max;
    }
    
    public int recur(TreeNode root){       
        if(root == null){return 0;}

        int l = recur(root.left);
        int r = recur(root.right);
        int lar = 0; int rar = 0;
        if(root.left != null && root.left.val == root.val){
            lar += l + 1;
        }

        if(root.right != null && root.right.val == root.val){
            rar += r + 1;
        }
        max = Math.max(max, lar + rar);
        return Math.max(lar,rar);
    }
}
