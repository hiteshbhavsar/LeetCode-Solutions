class JudgeCircle {
    /*
    Runtime: 7 ms, faster than 35.06% of Java online submissions for Robot Return to Origin.
Memory Usage: 39.1 MB, less than 45.53% of Java online submissions for Robot Return to Origin.
    */
    public boolean judgeCircle(String moves) {
        int lr=0,ud=0;
        for(int i=0;i<moves.length();i++)
        {
            if(moves.charAt(i)=='U')
                ud++;
            else if(moves.charAt(i)=='D')
                ud--;
            else if(moves.charAt(i)=='R')
                lr++;
            else if(moves.charAt(i)=='L')
                lr--;
                
        }
        
        return ud==0 && lr==0;
    }
}
