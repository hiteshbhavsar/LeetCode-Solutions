class CombinationSum3 {
    List<List<Integer>> combinations=new ArrayList<>();
    /*
    Runtime: 2 ms, faster than 16.80% of Java online submissions for Combination Sum III.
Memory Usage: 41.8 MB, less than 33.07% of Java online submissions for Combination Sum III.
    */
    public List<List<Integer>> combinationSum3(int k, int n) {       
        List<Integer> list=new ArrayList<>();
        generatecombinations(list,1,k,n);
        return combinations;
        
    }
    
    public void generatecombinations(List<Integer> list,int index,int k,int value)
    {
        if(value==0 && k==0)
        {
            combinations.add(new ArrayList(list));
            return;
        }
        
        if(value!=0&&k==0)
        {
            return;
        }
        
        if(value<0)
        {
            return;
        }
        
        for(int i=index;i<=9;i++)
        {
            if(list.contains(i))
            {
                return;
            }
            list.add(i);
            generatecombinations(list,index+1,k-1,value-i);
            list.remove(list.size()-1);
        }
    }
}
