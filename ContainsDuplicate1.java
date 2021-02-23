class ContainsDuplicate1 {
    /*
    Runtime: 6 ms, faster than 56.23% of Java online submissions for Contains Duplicate.
    Memory Usage: 45 MB, less than 56.55% of Java online submissions for Contains Duplicate.
    */
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                return true;
            }
            else
                map.put(nums[i],1);
        }
        return false;
    }
}
