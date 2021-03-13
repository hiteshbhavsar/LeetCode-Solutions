class RepeatedStringMatch {
    public int repeatedStringMatch(String A, String B) {
        /*
        Runtime: 252 ms, faster than 47.44% of Java online submissions for Repeated String Match.
Memory Usage: 39.3 MB, less than 31.03% of Java online submissions for Repeated String Match.
        */
        StringBuilder builder=new StringBuilder(A);
        int copies=1;
        while(builder.length()<B.length())
        {
            builder.append(A);
            copies++;

        }
        if(builder.indexOf(B)>=0)
        {
            return copies;
        }
        builder.append(A);
        copies++;
        if(builder.indexOf(B)>=0)
        {
            return copies;
        }
        return -1;
    }
  
}
