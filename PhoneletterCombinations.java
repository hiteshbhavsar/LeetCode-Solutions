class PhoneletterCombinations {
    
    /*
    Runtime: 4 ms, faster than 40.57% of Java online submissions for Letter Combinations of a Phone Number.
Memory Usage: 39 MB, less than 34.86% of Java online submissions for Letter Combinations of a Phone Number.
    */
    public List<String> letterCombinations(String digits) {
        ArrayList<String> result=new ArrayList<>();
        if(digits.length()==0||digits==null)   
            return result;
        String [] mappings={
            "0",
            "1",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };
        letterCombination(result,digits,"",0,mappings);
        return result;
    }
    
    public void letterCombination(List<String> result,String digits, String value, int index, String [] mappings)
    {
        if(index==digits.length())
        {
            result.add(value);
            return;
        }
        
        String vals=mappings[digits.charAt(index)-'0'];
        
        for(int i=0;i<vals.length();i++)
        {
            letterCombination(result,digits,value+vals.charAt(i),index+1,mappings);
        }
        
    }
}
