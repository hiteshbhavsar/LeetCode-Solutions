public class NumberOf1s {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String value=Integer.toBinaryString(n);
        int c=0;
        for(int i=0;i<value.length();i++)
        {
            if(value.charAt(i)=='1')
                c++;
        }
        return c;
    }
}
