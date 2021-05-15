class WordSearch {
    /*
    Runtime: 74 ms, faster than 42.60% of Java online submissions for Word Search.
Memory Usage: 36.8 MB, less than 74.37% of Java online submissions for Word Search.
    */
    int m,n;
    public boolean exist(char[][] board, String word) {
        m=board.length;
        n=board[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(board[i][j]==word.charAt(0) && checkWord(board,i,j,0,word))
                {
                  return true;
                }
            }
        }
        
        return false;
    }
    
    public boolean checkWord(char [][]board,int i,int j,int charat,String word)
    {
        if(charat==word.length())
        {
            return true;
        }

        if((i<0||i>=m||j<0||j>=n)||charat>=word.length()||board[i][j]!=word.charAt(charat))
            return false;
        
        char temp=board[i][j];
        board[i][j]=' ';
        boolean found = checkWord(board,i,j+1,charat+1,word)||
        checkWord(board,i+1,j,charat+1,word)||
        checkWord(board,i,j-1,charat+1,word)||
        checkWord(board,i-1,j,charat+1,word);
        board[i][j]=temp;
        return found;
    }
    
    
}
