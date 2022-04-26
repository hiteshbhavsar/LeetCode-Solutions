class CountKDifference {
    public int countKDifference(int[] nums, int k) {
        int c=0;
        /*
          Runtime: 8 ms, faster than 54.71% of Java online submissions for Count Number of Pairs With Absolute Difference K.
Memory Usage: 41.8 MB, less than 86.94% of Java online submissions for Count Number of Pairs With Absolute Difference K.      
        */
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(Math.abs(nums[i]-nums[j])==k)
                {
                    c++;    
                }
            }
        }
     return c;   
    }
}
