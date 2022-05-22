class AllPathsSourceTarget {
    /*
    Runtime: 3 ms, faster than 79.59% of Java online submissions for All Paths From Source to Target.
Memory Usage: 54.4 MB, less than 68.32% of Java online submissions for All Paths From Source to Target.
    */
    
    List<List<Integer>> result;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int target=graph.length-1;
        result=new ArrayList<>();
        ArrayList<Integer> path=new ArrayList<>();
        path.add(0);
        checkpath(graph,0,target,path);
        return result;
        
    }
    
    public void checkpath(int [][]graph,int currentpos,int target,ArrayList<Integer> path)
    {
        if(currentpos==target)
        {
            result.add(new ArrayList<>(path));
        }
        for(int index : graph[currentpos])
        {
            path.add(index);
            
            checkpath(graph,index,target,path);
            
            path.remove(path.size()-1);
                
        }
    }
}
