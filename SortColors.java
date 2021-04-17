class SortColors {
    public void sortColors(int[] nums) {
        /*
        Runtime: 0 ms, faster than 100.00% of Java online submissions for Sort Colors.
Memory Usage: 37.4 MB, less than 76.23% of Java online submissions for Sort Colors.
        */
       /* Arrays.sort(nums);*/
        
        /*
        Runtime: 0 ms, faster than 100.00% of Java online submissions for Sort Colors.
Memory Usage: 37.1 MB, less than 96.02% of Java online submissions for Sort Colors.
        
        */
         if(nums.length==0||nums.length==1) return;
        int start=0;
        int end=nums.length-1;
        int index=0;
        while(index<=end && start<end)
        {
            if(nums[index]==0){
                nums[index]=nums[start];
                nums[start]=0;
                start++;
                index++;
            }
            else if (nums[index]==2)
            {
                nums[index]=nums[end];
                nums[end]=2;
                end--;
            }
            else
            {
                index++;
            }
        }
    }
    
}
