class MaximumGap {
/*
    Runtime: 1 ms, faster than 100.00% of Java online submissions for Maximum Gap.
    Memory Usage: 39.2 MB, less than 65.56% of Java online submissions for Maximum Gap.
*/
    public int maximumGap(int[] nums) {
        if(nums==null || nums.length==1||nums.length==0)
        {
            return 0;
        }
        Arrays.sort(nums);int min=Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]-nums[i-1]>min)
                min=nums[i]-nums[i-1];
        }
        return min;
    }
}
