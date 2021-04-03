class CheckOnesSegment {
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Check if Binary String Has at Most One Segment of Ones.
Memory Usage: 36.8 MB, less than 98.47% of Java online submissions for Check if Binary String Has at Most One Segment of Ones.
    */
    public boolean checkOnesSegment(String s) {
        if(s==null) return false; // If string is null then return false;
        if(s.length()==1 && s.charAt(0)=='1') return true; // the string is "1" then return true
        int count=0; boolean bfound=false;
        for(int i=1;i<s.length();i++)
        {
            if(!bfound && s.charAt(i)=='0') // used to check to get the first 0 in the string
            {bfound=true;}
            if(bfound && s.charAt(i)=='1') // used to check the character 1 after getting 0
            {return false;}
            
        }
        return true; // if all the conditions are met so return true;
    }
}
