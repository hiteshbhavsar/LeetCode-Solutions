class SmallerNumbersThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        /*
        Runtime: 2 ms, faster than 89.37% of Java online submissions for How Many Numbers Are Smaller Than the Current Number.
Memory Usage: 45 MB, less than 20.02% of Java online submissions for How Many Numbers Are Smaller Than the Current Number.
        */
        int[] count = new int[102];
        int[] res = new int[nums.length];
        for(int num:nums){
            count[num]++;
        }
        for(int i=1; i<count.length;i++){
            count[i] = count[i-1]+count[i];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                res[i]=0;
            else
                res[i]=count[nums[i]-1];
        }
        return res;
    }
}
