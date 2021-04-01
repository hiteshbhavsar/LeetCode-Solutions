class FindUnsortedSubarray {
/*
Runtime: 1050 ms, faster than 5.02% of Java online submissions for Shortest Unsorted Continuous Subarray.
Memory Usage: 40.4 MB, less than 39.48% of Java online submissions for Shortest Unsorted Continuous Subarray.
*/
    public int findUnsortedSubarray(int[] nums) {
        int l = nums.length, r = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    r = Math.max(r, j);
                    l = Math.min(l, i);
                }
            }
        }
        return r - l < 0 ? 0 : r - l + 1;
    }
}
