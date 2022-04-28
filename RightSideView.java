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
class RightSideView {
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Right Side View.
Memory Usage: 40.7 MB, less than 94.07% of Java online submissions for Binary Tree Right Side View.
    */
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root , list , 0);
        return list;
    }
    public void helper(TreeNode root , List<Integer> list , int depth){
        if(root == null) return;
        
        if(depth == list.size()){
            list.add(root.val);
        }
        helper(root.right , list , depth+1);
        helper(root.left , list , depth+1);
    }
}

/*
//Obsolete way of doing it
class Solution {
    
//    Runtime: 4 ms, faster than 9.50% of Java online submissions for Binary Tree Right Side View.
//    Memory Usage: 43.4 MB, less than 6.67% of Java online submissions for Binary Tree Right Side View.
   
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null) return new ArrayList<Integer>();
        HashMap<Integer,ArrayList<Integer>> map =new HashMap<>();
        Queue<TreeNode> queue=new LinkedList<>();
        
        List<Integer> result=new ArrayList<>();
        queue.add(root);
        map.put(0,new ArrayList<Integer>());
        map.get(0).add(root.val);
        //result.add(root.val);
        int level=1;
        while(!queue.isEmpty())
        {
            int siz=queue.size();
            for(int i=0;i<siz;i++)
            {
                TreeNode node=queue.poll();
                
                if(node.right!=null)
                {
                    if(!map.containsKey(level))
                    {
                        map.put(level,new ArrayList<Integer>());
                        map.get(level).add(node.right.val);
                    }
                    queue.add(node.right);
                    
                }
                
                if(node.left!=null)
                {
                    if(node.right==null)
                    {
                        if(!map.containsKey(level))
                        {
                            map.put(level,new ArrayList<Integer>());
                            map.get(level).add(node.left.val);
                        }
                    }
                    queue.add(node.left);
                }
            }
            level++;
        }
        
        for (Map.Entry entry : map.entrySet()) {
            result.addAll((ArrayList)entry.getValue());
        }
        
        
        return result;
    }
    
    
    
}
 */
