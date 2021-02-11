class LengthOfLastWord {
    /*
    Runtime: 1 ms, faster than 52.10% of Java online submissions for Length of Last Word.
    Memory Usage: 37.8 MB, less than 29.54% of Java online submissions for Length of Last Word.

    */
    public int lengthOfLastWord(String s) {
        s=s.trim();
        if(!s.equals("")|| !s.equals(null))
        {
            String  strar[]=s.split(" ");
            return strar[strar.length-1].length();
        }
        return 0;
    }
}
