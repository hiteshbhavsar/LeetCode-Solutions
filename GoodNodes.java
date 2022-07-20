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
class GoodNodes {
    /*
    Runtime: 3 ms, faster than 73.35% of Java online submissions for Count Good Nodes in Binary Tree.
Memory Usage: 59.9 MB, less than 35.18% of Java online submissions for Count Good Nodes in Binary Tree.
    */
    int count=0;
    public int goodNodes(TreeNode root) {
        if(root==null) return 0;
        else
        return countNodes(root,root.val);
    }
    
    public int countNodes(TreeNode root,int previousMax)
    {
        if(root==null)
            return 0;
        
        if(root.val>=previousMax)
        {
            count++;
            previousMax=root.val;
        }
        
        countNodes(root.left,previousMax);
        countNodes(root.right,previousMax);
        
        return count;
    }
}
