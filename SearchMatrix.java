class SearchMatrix {
    /*
    Runtime: 1 ms, faster than 32.89% of Java online submissions for Search a 2D Matrix.
Memory Usage: 41.9 MB, less than 87.00% of Java online submissions for Search a 2D Matrix.
    */
    public boolean searchMatrix(int[][] matrix, int target) {
        int max=0,min=0;int m=matrix.length;int n=matrix[0].length;
        int index=-1;
        for(int i=0;i<m;i++)
        {
            min=matrix[i][0];
            max=matrix[i][n-1];
            if(target>=min && target<=max)
            {
                index=i;
            }
        }
        
        if(index==-1) return false;
        
        return binarysearch(matrix[index],0,n,target);
        
    }
    
    public boolean binarysearch(int [] array,int start,int end, int target)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            
            if(array[mid]==target)
            {
                return true;
            }
            if(target>array[mid])
            {
                start=mid+1;
            }
            else if(target<array[mid])
            {
                end=mid-1;
            }
        }
        return false;
    }
}
