class FindContentChildren {
    /*
    Runtime: 14 ms, faster than 11.48% of Java online submissions for Assign Cookies.
Memory Usage: 39.7 MB, less than 70.88% of Java online submissions for Assign Cookies.
    */
    public int findContentChildren(int[] g, int[] s) {
        int count=0;
        Arrays.sort(g);Arrays.sort(s);
        for(int i=0;i<g.length;i++)
        {
            for(int j=i;j<s.length;j++)
            {
                if(s[j]>=g[i])
                {
                    count++;s[j]=0;g[i]=0;break;
                }
            }
        }
        return count;
    }
}
