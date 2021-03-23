class LongestIncreasingPath {
    /*
    
    // This problem is the combination of DFS and memorization
    Runtime: 8 ms, faster than 75.36% of Java online submissions for Longest Increasing Path in a Matrix.
Memory Usage: 38.9 MB, less than 96.69% of Java online submissions for Longest Increasing Path in a Matrix.
    */
    int [][] Directions={{-1,0},{0,-1},{1,0},{0,1}};
    public int longestIncreasingPath(int[][] matrix) {
        if(matrix==null||matrix.length==0) return 0;
        
        int n=matrix.length,m=matrix[0].length,longestPath=0;
        
        int [][] cache=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int longest=longestIncreasingPath(matrix,cache,n,m,i,j);
                longestPath=Math.max(longestPath,longest);
            }
        }
        return longestPath;
    }
    
    
    public int longestIncreasingPath(int [][]matrix,int[][] cache,int n, int m, int i,int j)
    {
        int max=0;
        if(cache[i][j]>0) return cache[i][j];
        
            for(int [] directions : Directions)
            {
                int x=directions[0]+i,y=directions[1]+j;
                if(x>-1 && y>-1 && x<n && y<m && matrix[x][y]>matrix[i][j])
                {
                    int longest=longestIncreasingPath(matrix,cache,n,m,x,y);
                    max=Math.max(max,longest);
                }
            }
        cache[i][j]=max+1;
        return cache[i][j];
    }
}
