class GetMaximumGold {
    /*
    Runtime: 13 ms, faster than 95.14% of Java online submissions for Path with Maximum Gold.
Memory Usage: 36.6 MB, less than 44.55% of Java online submissions for Path with Maximum Gold.
    */
     public int getMaximumGold(int[][] grid) {
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                max = Math.max(max,dfs(i,j,grid));
            }
        }
        return max;
    }
    
    public int dfs(int i, int j, int[][] grid){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0){
            return 0;
        }
        
        int count = grid[i][j];
        grid[i][j] = 0;
        
        int top = dfs(i-1,j,grid);
        int down = dfs(i+1,j,grid);
        int left = dfs(i,j-1,grid);
        int right = dfs(i,j+1,grid);
        grid[i][j] = count;
        int m1 = Math.max(top,down);
        int m2 = Math.max(left,right);
        return count + Math.max(m1,m2);
    }

}
