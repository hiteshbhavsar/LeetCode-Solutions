class MaxAscendingSum {
    /*
    
Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Ascending Subarray Sum.
Memory Usage: 36.3 MB, less than 90.08% of Java online submissions for Maximum Ascending Subarray Sum.
Next challenges:
    */
    public int maxAscendingSum(int[] nums) {
	int biggest = 0;
	for (int i = 0; i < nums.length; i++) {
		int current = nums[i];
		for (int k = i+1; k < nums.length; k++) {
			if(nums[k-1]>=nums[k]){
				break;
			}else if(nums[k-1]<nums[k] ){
				current += nums[k];
			}
		}
		biggest = current>biggest? current : biggest;
	}
	return biggest;
}
}
