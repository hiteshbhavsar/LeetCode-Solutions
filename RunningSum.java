class RunningSum {
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Running Sum of 1d Array.
    Memory Usage: 38.8 MB, less than 90.73% of Java online submissions for Running Sum of 1d Array.
    */
    public int[] runningSum(int[] nums) {
        int sum=nums[0];;
        int [] result=new int[nums.length];
        result[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            sum+=nums[i];
            result[i]=sum;
        }
        return result;
    }   
}
