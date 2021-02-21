class PartitionLabels {
    /*
    Runtime: 2 ms, faster than 99.60% of Java online submissions for Partition Labels.
    Memory Usage: 38 MB, less than 47.63% of Java online submissions for Partition Labels.
    */
    public List<Integer> partitionLabels(String S) {
        ArrayList<Integer> result= new ArrayList<>();
        int chararray[]=new int[26];
        for(int i=0;i<S.length();i++)
        {
            chararray[S.charAt(i)-'a']=i;
        }
        int i=0;
        while(i<S.length())
        {
            int end=chararray[S.charAt(i)-'a'];
            int j=i;
            while(j!=end){ end=Math.max(end,chararray[S.charAt(j++)-'a']);}
            result.add(j-i+1);
            i=j+1;
            
        }
        return result;
    }
}
