class CourseSchedule {
    /*
      Runtime: 2 ms, faster than 99.45% of Java online submissions for Course Schedule.
      Memory Usage: 39.4 MB, less than 79.99% of Java online submissions for Course Schedule.
    */
    List<Integer>[]adjacencylist;
    boolean [] visited;
    boolean [] explored;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(prerequisites==null||prerequisites.length==0) return true;
        
        adjacencylist=new ArrayList[numCourses];
        
        for(int i=0;i<numCourses;i++)
        {
            adjacencylist[i]=new ArrayList<>();
        }
        
        visited=new boolean[numCourses];
        explored=new boolean[numCourses];
        for(int i=0;i<prerequisites.length;i++)
        {
            adjacencylist[prerequisites[i][0]].add(prerequisites[i][1]);
        }
        
        for(int i=0;i<numCourses;i++)
        {
            if(!visited[i])
            {
                if(isCycle(i)){
                    return false;
                }
            }
        }
        return true;
    }
    
    
    public boolean isCycle(int n)
    {
        visited[n]=true;
        for(Integer j: adjacencylist[n])
        {
            if(!visited[j])
            {
                if(isCycle(j))
                {
                    return true;
                }
            }
            else if(!explored[j])
            {
                return true;
            }
            
            
            
        }
            explored[n]=true;
                return false;
    }
}
