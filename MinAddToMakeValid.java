class MinAddToMakeValid {
    /*
    Runtime: 1 ms, faster than 53.47% of Java online submissions for Minimum Add to Make Parentheses Valid.
    Memory Usage: 38.9 MB, less than 5.72% of Java online submissions for Minimum Add to Make Parentheses Valid.
    */
    public int minAddToMakeValid(String s) {
        int open=0,c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                open++;
            }
            else if(--open<0)
            {
                open++;c++;
            }
        }
        return open+c;
    }
}
