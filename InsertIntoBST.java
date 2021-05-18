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
class InsertIntoBST {
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Insert into a Binary Search Tree.
Memory Usage: 39.5 MB, less than 76.62% of Java online submissions for Insert into a Binary Search Tree.
    */
    public TreeNode insertIntoBST(TreeNode root, int val) {
        return generateBST(root,val);
    }
    
    public TreeNode generateBST(TreeNode root, int val)
    {
        if(root==null)
        {
            root=new TreeNode(val);
        }
            
        if(val>root.val)
            root.right=generateBST(root.right,val);
        else if(val<root.val) 
            root.left=generateBST(root.left,val);

        return root;
    }
}
