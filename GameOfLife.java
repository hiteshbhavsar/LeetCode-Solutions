class GameOfLife {
    int[][] nextstate;
    public void gameOfLife(int[][] board) {
        
        nextstate=new int[board.length][board[0].length];
        int m=board.length,n=board[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                checkState(board,i,j,m,n);
            }
        }
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]=nextstate[i][j];        
            }
        }
        
        
    }
    
    
    public void checkState(int[][] states,int i,int j,int maxx,int maxy)
    {
        int [][] directions={{-1,0},{1,0},{0,1},{0,-1},{1,1},{-1,-1},{1,-1},{-1,1}};
        
        int currentstate=states[i][j];int c=0;
        for(int a=0;a<directions.length;a++)
        {
            int dx=i+directions[a][0];
            int dy=j+directions[a][1];
            
            if((dx>=0 && dx<maxx)&& (dy>=0 &&dy<maxy))
            {
               
                
                if(states[dx][dy]==1)
                {
                    c++;
                }
            }
        }
        
        
       
        if(c==2 && currentstate==1)
        {nextstate[i][j]=1;}    
        if((c==3) )
        {nextstate[i][j]=1;}
        else if(c<2||c>3)
        {nextstate[i][j]=0;}
       
        
    }
}
