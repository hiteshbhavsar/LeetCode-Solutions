class SpiralMatrix2 {
    public int[][] generateMatrix(int n) {
        /*
        Runtime: 0 ms, faster than 100.00% of Java online submissions for Spiral Matrix II.
Memory Usage: 42.1 MB, less than 11.47% of Java online submissions for Spiral Matrix II.

        */
        int value=n*n;
        int start=1;
        int array[][]=new int[n][n];
        int top=0,left=0,bottom=n-1,right=n-1;
        while(start<=value)
        {
            for(int i=top;i<=right;i++)
            {
                if(start<=value)
                {
                    array[top][i]=start;
                    start++;
                }
            }
            top++;
            
            for(int i=top;i<=bottom;i++)
            {
                if(start<=value)
                {
                    array[i][right]=start;
                    start++;
                }
            }
            right--;
            
            for(int i=right;i>=left;i--)
            {
                if(start<=value)
                {
                    array[bottom][i]=start;
                    start++;
                }
            }
            bottom--;
            
            for(int i=bottom;i>=top;i--)
            {
                if(start<=value)
                {
                    array[i][left]=start;
                    start++;
                }
            }
            left++;
            
        }
        return array;
    }
}
