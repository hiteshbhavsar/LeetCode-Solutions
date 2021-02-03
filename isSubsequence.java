class isSubsequence {
/*
    Runtime: 1 ms, faster than 80.41% of Java online submissions for Is Subsequence.
    Memory Usage: 39 MB, less than 12.36% of Java online submissions for Is Subsequence.
*/

    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)
            return true;
        int i=0;
        int j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
                j++;
            if(i==s.length())
                return true;
            }
            return false;
        }
}
