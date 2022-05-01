/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class InorderSuccessor {
    /*
    Runtime: 3 ms, faster than 60.50% of Java online submissions for Inorder Successor in BST.
Memory Usage: 49.3 MB, less than 36.76% of Java online submissions for Inorder Successor in BST.
    */
    TreeNode node=null; //for storing the final result
    boolean isNodefound=false; // to check while traversing we found the node or not
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        inOrder(root,p);
        return node;
    }
    
    public void inOrder(TreeNode root,TreeNode p)
    {
        if(root==null)
        {
            return;
        }
        
        if(root==p)
        {
            isNodefound=true; // we set the boolean variable that the node whose Inorder successor is to be found is found while traversing the tree
           
        }
        
        inOrder(root.left,p);
        //Going ahead when the node is found and if the node is not yet assigned value then set the node value if the value of the current node is greater than the p node
        if(isNodefound && node==null)
        {
            if(root.val>p.val)
            {
                node=root;
                return;
            }
        }
        if(node!=null) return; // this line can be skipped but its just to make sure when the node value is assigned then it should compute any further
        
        inOrder(root.right,p);
    }
}
