class IsPowerOfFour {
    /*
    Runtime: 1 ms, faster than 99.37% of Java online submissions for Power of Four.
Memory Usage: 36.2 MB, less than 46.34% of Java online submissions for Power of Four.
    */
    public boolean isPowerOfFour(int num) {
        
       return (Math.log(num)/Math.log(4))%1 == 0;
    }
}
