class HammingDistance {
    /*
    Runtime: 12 ms, faster than 11.82% of Java online submissions for Hamming Distance.
Memory Usage: 37.4 MB, less than 5.13% of Java online submissions for Hamming Distance.
    */
    public int hammingDistance(int x, int y) {
        String strx=String.format("%32s",Integer.toBinaryString(x)).replaceAll(" ","0");
        String stry=String.format("%32s",Integer.toBinaryString(y)).replaceAll(" ","0");
        int c=0;
        for(int i=0;i<strx.length();i++)
        {
            if(strx.charAt(i)!=stry.charAt(i))
            {
                c++;
            }
        }
        return c;
    }
}
