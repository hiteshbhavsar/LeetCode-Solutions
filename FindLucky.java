class FindLucky {
    /*
    Runtime: 5 ms, faster than 20.73% of Java online submissions for Find Lucky Integer in an Array.
Memory Usage: 38.9 MB, less than 36.17% of Java online submissions for Find Lucky Integer in an Array.
    */
    public int findLucky(int[] array) {
        if(array.length==1) return -1;
        Arrays.sort(array);
        HashMap<Integer,Integer> map=new HashMap();
        for(int i=0;i<array.length;i++)
        {
            if(map.containsKey(array[i]))
            {
                map.put(array[i],map.get(array[i])+1);
            }
            else
                map.put(array[i],1);
        }
        int max=-1;
        for(Integer k: map.keySet())
        {

            if(k>max && k==map.get(k))
            {
                max=k;
            }
        }
        return max;
    }
}
