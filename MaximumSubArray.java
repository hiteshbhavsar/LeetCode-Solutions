class MaximumSubArray {
    //This solution tends to find the maximum sum by trying various combinations of subarrays
    public int maxSubArray(int[] nums) {
        if(nums==null) return 0;
        if(nums.length==1)return nums[0];
        int result=Integer.MIN_VALUE;int max_current=nums[0],max_global=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            max_current=Math.max(nums[i],max_current+nums[i]);
            if(max_current>max_global)
            {
                max_global=max_current;
            }
            
        }
        return max_global;
    }
    
}
