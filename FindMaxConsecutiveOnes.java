class FindMaxConsecutiveOnes {
  /*
  Runtime: 3 ms, faster than 16.81% of Java online submissions for Max Consecutive Ones.
  Memory Usage: 52.7 MB, less than 16.47% of Java online submissions for Max Consecutive Ones.
  */
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                if(max<count)
                    max=count;
                count=0;
            }
            else
            {
                count++;
            }
        }
        return (count>max)?count:max;
    }
}
