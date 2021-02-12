class SearchInsertPosition {
/*
  Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
  Memory Usage: 38.9 MB, less than 37.79% of Java online submissions for Search Insert Position.
*/
    public int searchInsert(int[] nums, int target) {
        int index=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                index=i;
                break;
            }
        }
        if(index==-1)
        {
            for(int j=0;j<nums.length;j++)
            {
                if( nums[j]<=target)
                {
                    index=j+1;
                    
                }
                
            }
        }
        
        if(index<0){index=0;}
        return index;
    }
}
