class AverageOfLevels {
    public List<Double> averageOfLevels(TreeNode root) {
        //Checking the base condition 
        if(root==null)
        {
            return new ArrayList<Double>(){};
        }
        
        List<Double> result=new ArrayList<Double>();
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.add(root); // Initially adding root to the queue to check for the left and right part
        
        while(!queue.isEmpty())
        {
            double sum=0;
            int size=queue.size(); // Check the size and dequeue the elements from queue
            for(int i=0;i<size;i++)
            {
                
                TreeNode value=queue.poll();
                sum+=value.val;
                if(value.left!=null) //Add the left node to the queue to check the left subtree
                {
                    queue.add(value.left);
                }
                if(value.right!=null)//Add the right node to the queue to check the right subtree
                {
                    queue.add(value.right);
                }
            }
            result.add(sum/size); // Adding the average to the list
        }
        return result;
    }
}
