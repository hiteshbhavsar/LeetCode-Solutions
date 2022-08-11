class FindLengthOfLCIS {
    public int findLengthOfLCIS(int[] nums) {
      /*
      Runtime: 2 ms, faster than 49.63% of Java online submissions for Longest Continuous Increasing Subsequence.
Memory Usage: 46.5 MB, less than 7.34% of Java online submissions for Longest Continuous Increasing Subsequence.
      */
        int l_seq=1;
        int dp[]=new int[nums.length];
        dp[0]=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<=nums[i-1])
            {
                dp[i]=1;
            }
            else
            {
                dp[i]=dp[i-1]+1;
            }
            l_seq=Math.max(l_seq,dp[i]);
        }
        
        return l_seq;
        
    }
}
