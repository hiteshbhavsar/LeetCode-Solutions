class BuildingsWithOceanView {
    public int[] findBuildings(int[] heights) {
        /*
        Runtime: 15 ms, faster than 48.07% of Java online submissions for Buildings With an Ocean View.
Memory Usage: 55.8 MB, less than 90.72% of Java online submissions for Buildings With an Ocean View.
        */
        int n=heights.length;
        if(n<2) return new int[]{0};
        Stack<Integer> stack=new Stack<>();
        int tallest=heights[n-1];
        stack.push(n-1);
        for(int i=n-2;i>=0;i--)
        {
            if(heights[i]>tallest)
            {
                stack.push(i);
            }
            tallest=Math.max(tallest,heights[i]);
        }
        
        if(stack.size()==0)
            return new int[0];
        
        int [] res=new int[stack.size()];
        int a=0;
        while(!stack.isEmpty())
        {
            res[a++]=stack.pop();
        }
        return res;
    }
}
