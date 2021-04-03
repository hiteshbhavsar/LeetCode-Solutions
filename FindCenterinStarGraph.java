class FindCenterinStarGraph {
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Center of Star Graph.
Memory Usage: 64.8 MB, less than 56.00% of Java online submissions for Find Center of Star Graph.
    */
    public int findCenter(int[][] edges) {
        int x=edges[0][0];
        int y=edges[0][1];
        if(edges[1][0]==x||edges[1][1]==x)
        {
            return x;
        }
        return y;
    }
}
