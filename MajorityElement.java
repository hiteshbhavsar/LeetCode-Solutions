class MajorityElement {
    public int majorityElement(int[] nums) {
        /*
        Runtime: 1 ms, faster than 99.95% of Java online submissions for Majority Element.
Memory Usage: 41.9 MB, less than 92.58% of Java online submissions for Majority Element.
        
        */
        int count=1;
        int res=nums[0];
        for(int i=1;i<nums.length;i++){
            if(count==0){
                count=1;
                res=nums[i];
            }else if(nums[i]==res){
                count++;
            }else{
                count--;
            }
        }
        return res;
    }
}
