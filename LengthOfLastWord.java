class LengthOfLastWord {
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
