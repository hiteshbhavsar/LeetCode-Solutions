class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        /*
        Runtime: 13 ms, faster than 36.35% of Java online submissions for Duplicate Zeros.
Memory Usage: 45.6 MB, less than 59.73% of Java online submissions for Duplicate Zeros.
        */
        int index=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0 && i!=arr.length-1)
            {
                index=i+1;int value=0;
                for(int j=arr.length-1;j>i;j--)
                {
                    arr[j]=arr[j-1];
                }
                i++;
            }
        }
    }
}
