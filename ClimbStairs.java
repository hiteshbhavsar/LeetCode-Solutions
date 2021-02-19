class ClimbStairs {
    public int climbStairs(int n) {
 /*
    // Recursive solution
        if(n==0||n==1)
            return 1;
        else
            return climbStairs(n-1)+climbStairs(n-2);
*/
        int array[]=new int[n+1];
        array[0]=1;
        array[1]=1;
        for(int i=2;i<=n;i++)
        {
            array[i]=array[i-1]+array[i-2];
        }
            
        return array[n];
    }
}
