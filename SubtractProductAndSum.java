class Solution {
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Subtract the Product and Sum of Digits of an Integer.
Memory Usage: 36 MB, less than 28.31% of Java online submissions for Subtract the Product and Sum of Digits of an Integer.
    */
    public int subtractProductAndSum(int n) {
       int sum=0,mult=1;
        while(n>0)
        {
            sum+=n%10;
            mult*=n%10;
            n=n/10;
        }
        return mult-sum;
    }
    
}
