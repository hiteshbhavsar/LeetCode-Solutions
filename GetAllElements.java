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
class GetAllElements {
    /*
    Runtime: 13 ms, faster than 83.43% of Java online submissions for All Elements in Two Binary Search Trees.
Memory Usage: 41.6 MB, less than 87.49% of Java online submissions for All Elements in Two Binary Search Trees
    */
    List<Integer> result=new ArrayList<Integer>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        
     if(root1==null && root2==null)
     {
         return result;
     }
    else if(root1!=null && root2==null)
    {   
        inOrder(root1);
        return result;
    }
    else if(root1==null && root2!=null)
    {   
        inOrder(root2);
        return result;            
    }
    else
    {
        inOrder(root1);
        inOrder(root2);
    }
        Collections.sort(result);
        return result;
    }
    
    public void inOrder(TreeNode root)
    {
        if(root==null)
            return;
         inOrder(root.left);
         result.add(root.val);    
         inOrder(root.right);
    }
    
}
