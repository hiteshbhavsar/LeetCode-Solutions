class SearchinSortedArray2 {
/*
Runtime: 6 ms, faster than 5.99% of Java online submissions for Search in Rotated Sorted Array II.
Memory Usage: 38.5 MB, less than 85.51% of Java online submissions for Search in Rotated Sorted Array II.
*/

    public boolean search(int[] nums, int target) {
        return binarysearch(nums,0,nums.length-1,target);
    }
    
    public boolean binarysearch(int array[], int low,int high,int target)
    {
        if(low>high)
        {
            return false;
        }
        
        //int median=(low+high)/2;
        int median=low+(high-low)/2;
        System.out.println(median);
        if(array[median]==target)
        {
            return true;
        }
        
        if(array[low]==array[median] && array[median]==array[high]) //for test case [1,3,1,1,1] target =3
        {
            low++;high--;
        }
        else if(target>=array[median])
        {
            if (array[low] > array[median] && target > array[high]) // This case when pivot is between L and M and target > nums[R]
                high = median - 1;
            else 
                low = median + 1;
        }
        else
        {
            if(array[median]>array[high] && target<array[low])
            {
                low=median+1;
            }
            else
                high=median-1;
                
        }
        return binarysearch(array,low,high,target);
    }
}
