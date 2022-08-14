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
class FindSecondMinimumValue {
    /*
    Runtime: 1 ms, faster than 27.86% of Java online submissions for Second Minimum Node In a Binary Tree.
Memory Usage: 41.5 MB, less than 50.10% of Java online submissions for Second Minimum Node In a Binary Tree.
    */
     
    public int findSecondMinimumValue(TreeNode root) {
       List<Integer> list=new ArrayList<>();
        if(root==null) return -1;
        helper(root,list);
        Collections.sort(list);
        
        int v=list.get(0);
        for(int i=1;i<list.size();i++)
        {
            if(list.get(i)>v)
            {
                return list.get(i);
            }
        }
        return -1;
    }
    
    public void helper(TreeNode root,List<Integer> list)
    {
        if(root==null) return;
        list.add(root.val);
        helper(root.left,list);
        helper(root.right,list);
    }
}
