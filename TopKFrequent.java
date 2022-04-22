class TopKFrequent {
  /*
  Runtime: 20 ms, faster than 36.00% of Java online submissions for Top K Frequent Elements.
Memory Usage: 51.1 MB, less than 18.80% of Java online submissions for Top K Frequent Elements.
  */
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        LinkedHashMap<Integer,Integer> revmap
            =new LinkedHashMap<>();
            map.entrySet()
              .stream()
              .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) 
              .forEachOrdered(x -> revmap.put(x.getKey(), x.getValue()));
        
        int array[]=new int[k];
        int j=0;
        Iterator iter = revmap.entrySet().iterator();
        while(iter.hasNext()&&j<=(k-1))
        {
            Map.Entry mapElement
                = (Map.Entry)iter.next();
            array[j]=(int)mapElement.getKey();
            j++;
        }
        return array;
    }
}
