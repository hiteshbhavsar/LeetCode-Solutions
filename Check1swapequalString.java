class Check1swapequalString {
    /*
    Runtime: 1 ms, faster than 100.00% of Java online submissions for Check if One String Swap Can Make Strings Equal.
    Memory Usage: 37 MB, less than 100.00% of Java online submissions for Check if One String Swap Can Make Strings Equal.
    
    */
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1==null||s2==null) return false;
        if(s1.equals(s2)) return true;
        
        int count=0; ArrayList<Integer> list=new ArrayList<>();
        
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!=s2.charAt(i)){
                list.add(i);count++;
            }
            
        }
        
        if(count==2)
        {
            if(s1.equals(swapChar(s2,list.get(0),list.get(1))))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
       
        return false;
        
    }
    
    public String swapChar(String s,int i,int j)
    {
        StringBuilder myString = new StringBuilder(s);
        myString.setCharAt(i, s.charAt(j));
        myString.setCharAt(j, s.charAt(i));
        return myString.toString();    
        
    }
}
