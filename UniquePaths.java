class UniquePaths {
    public int uniquePaths(int m, int n) {
        /*
        Runtime: 0 ms, faster than 100.00% of Java online submissions for Unique Paths.
        Memory Usage: 35.9 MB, less than 54.46% of Java online submissions for Unique Paths.
        */
     int [][] paths=new int[m][n];
         for(int i=0;i<n;i++)
         {
             paths[0][i]=1;
         }
         for(int i=0;i<m;i++)
         {
             paths[i][0]=1;
         }
        
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                paths[i][j]=paths[i-1][j]+paths[i][j-1];
            }
        }
        
        return paths[m-1][n-1];
    
    }
}
