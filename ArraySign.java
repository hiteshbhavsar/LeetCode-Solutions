class ArraySign {
    /*
    Runtime: 1 ms, faster than 58.74% of Java online submissions for Sign of the Product of an Array.
Memory Usage: 44.5 MB, less than 16.11% of Java online submissions for Sign of the Product of an Array.
    */
    public int arraySign(int[] nums) {
       int neg=0,pos=0,zero=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                neg++;
            }
            else if(nums[i]>0)
            {
                pos++;
            }
            else if(nums[i]==0)
            {
                zero++;
            }
            
        }
        
        return zero>0?0:(neg%2!=0)?-1:1;
    }
}
