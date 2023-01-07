class Combinations {
    /*
    Runtime: 80 ms, faster than 13.18% of Java online submissions for Combinations.
    Memory Usage: 43.4 MB, less than 94.65% of Java online submissions for Combinations.
    */
    List<List<Integer>> list;
    public List<List<Integer>> combine(int n, int k) {
        list=new ArrayList<>();
        List<Integer> set=new ArrayList<>();
        makeList(1,n,k,set);
        //list.remove(list.size()-1);
        return list;
            
        
    }
    
    public void makeList(int j,int n,int k,List<Integer> set)
    {
        if(set.size()==k){
            list.add(new ArrayList<Integer>(set));
            return;}
        for(int a=j;a<=n;a++)
        {
            
            set.add(a);
            makeList(a+1,n,k,set);
            set.remove(new Integer(a));
            
        }
            
    }
}
