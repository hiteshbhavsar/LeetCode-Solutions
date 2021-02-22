class BinarySearch {
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Search.
    Memory Usage: 51.9 MB, less than 6.18% of Java online submissions for Binary Search.
    */
    public int search(int[] nums, int target) {
         return binarysearch(nums,0,nums.length-1,target);
    }
    
    public int binarysearch(int[] array,int low, int high, int target)
    {
        if(low>high)
        {
            return -1;
        }
        else
        {
            int mid=(low+high)/2;
            if(target==array[mid])
            {
                return mid;
            }
            if(target>array[mid])
                return binarysearch(array,mid+1,high,target);
            else
                return binarysearch(array,low,mid-1,target);
        }
    }
}
