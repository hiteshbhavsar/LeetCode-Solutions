class Candy {
    /*
        Runtime: 2 ms, faster than 93.08% of Java online submissions for Candy.
        Memory Usage: 40 MB, less than 61.93% of Java online submissions for Candy.
    */
    public int candy(int[] ratings) {
        int candies[]=new int[ratings.length];
        candies[0]=1;
        //Initially we traverse through the array and provide with 1 candies to each students 
        // and plus 1 candies to the student whose neighbor at the left has a lower rating
        for(int i=1;i<ratings.length;i++)
        {
            if(ratings[i]>ratings[i-1])
            {
                candies[i]=candies[i-1]+1;
            }
            else
                candies[i]=1;
        }
        
        // We need to traverse the array again from right to left 
        // to look for certain condition for examples lets take 
        // rating to be [5,4,3,2,1] in this case intially the candies distribution
        // would be [1,1,1,1,1] which is wrong to make sure we dont encounter this situation
        // we traverse the array from right to left again
        int result = candies[ratings.length - 1];
        
        for (int i = ratings.length - 2; i >= 0; i--) {
        int cur = 1;
        if (ratings[i] > ratings[i + 1]) {
        cur = candies[i + 1] + 1;
        }
        result += Math.max(cur, candies[i]);
        candies[i] = cur;
        }
        return result;
    }
}
