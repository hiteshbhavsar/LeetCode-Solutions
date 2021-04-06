class HasAlternatingBits {
    public boolean hasAlternatingBits(int n) {
        /*
        Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Number with Alternating Bits.
Memory Usage: 35.7 MB, less than 70.52% of Java online submissions for Binary Number with Alternating Bits.
        */
        String value=Integer.toBinaryString(n);
        char set=value.charAt(0);
        for(int i=1;i<value.length();i++)
        {
            if(set==value.charAt(i))
                return false;
            else 
                set=value.charAt(i);
        }
        return true;
    }
}
