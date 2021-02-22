class Fibonacci {
    /*
    Runtime: 7 ms, faster than 24.54% of Java online submissions for Fibonacci Number.
    Memory Usage: 35.5 MB, less than 83.52% of Java online submissions for Fibonacci Number.
    */
    public int fib(int n) {
        if(n==1)
            return 1;
        else if(n==0)
            return 0;            
        else
            return fib(n-1)+fib(n-2);
    }
}
