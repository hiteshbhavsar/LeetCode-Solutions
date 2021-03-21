class SortedSquares {
    /*
    Runtime: 3 ms, faster than 36.44% of Java online submissions for Squares of a Sorted Array.
Memory Usage: 54.2 MB, less than 5.10% of Java online submissions for Squares of a Sorted Array.
    */
    public int[] sortedSquares(int[] A) {
        int arr[]=new int[A.length];
        for(int i=0;i<A.length;i++)
        {
            arr[i]=A[i]*A[i];
        }
        Arrays.sort(arr);
        return arr;
    }
}
