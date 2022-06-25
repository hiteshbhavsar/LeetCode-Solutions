class NumRescueBoats {
    public int numRescueBoats(int[] people, int limit) {
        /*
        Runtime: 17 ms, faster than 98.29% of Java online submissions for Boats to Save People.
Memory Usage: 50.7 MB, less than 89.01% of Java online submissions for Boats to Save People.
        */
        Arrays.sort(people);
        int count=0;
        int start=0,end=people.length-1;
        while(start<=end)
        {
            if(start==end && people[start]<=limit)
            {
                count++;return count;
            }
            int sum_weight=people[start]+people[end];
            if(sum_weight<=limit)
            {
                count++;start++;end--;
            }
            else
            {
                end--;
                count++;
            }
        }
        return count;
    }
}
