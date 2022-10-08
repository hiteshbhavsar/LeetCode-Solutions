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
class AddOneRow {
    /*
    Runtime: 2 ms, faster than 26.01% of Java online submissions for Add One Row to Tree.
Memory Usage: 45.8 MB, less than 13.91% of Java online submissions for Add One Row to Tree.
    */
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        int cur_depth=1;
        if(depth==1)
        {
            TreeNode temp=new TreeNode(val);
            temp.left=root;
            root= temp;
            return root;
        }

        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            int size=queue.size();
            cur_depth++;
            for(int i=0;i<size;i++)
            {
                TreeNode node=queue.poll();
                TreeNode leftNode=node.left;
                TreeNode rightNode=node.right;
                if(leftNode!=null)
                    queue.offer(leftNode);
                if(rightNode!=null)
                    queue.offer(rightNode);
                
                if(cur_depth==depth)
                {
                    TreeNode temp=null;
                    if(leftNode==null)
                    {
                        node.left=new TreeNode(val);
                    }
                    else
                    {
                        temp=node.left;
                        node.left=new TreeNode(val);
                        node.left.left=leftNode;
                    }
                    if(rightNode==null)
                    {
                        node.right=new TreeNode(val);
                    }
                    else
                    {
                        temp=node.right;
                        node.right=new TreeNode(val);
                        node.right.right=rightNode;
                    }
                }
            }
        }
        return root;
        
    }
}
