class MinDeletionSize {
    /*
    Runtime: 10 ms, faster than 67.93% of Java online submissions for Delete Columns to Make Sorted.
Memory Usage: 48.5 MB, less than 16.63% of Java online submissions for Delete Columns to Make Sorted.

    */
   public int minDeletionSize(String[] A) {
        int count = 0;
        for (int i = 0; i < A[0].length(); i++) {
            for (int j = 1; j < A.length; j++) {
                if (A[j-1].charAt(i) > A[j].charAt(i)) {
                    count++;
                    break;
                }
            }
         }
        
        return count;
    }
}
