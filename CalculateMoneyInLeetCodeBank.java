class CalculateMoneyInLeetCodeBank {
/*
  Runtime: 1 ms, faster than 62.82% of Java online submissions for Calculate Money in Leetcode Bank.
  Memory Usage: 35.9 MB, less than 70.04% of Java online submissions for Calculate Money in Leetcode Bank.

*/
    public int totalMoney(int n) {
        int sum=0,count=1,start=1,step=0;
        // Sum represent the amount gained, count represent the value by which amout would be increased, step=0
        for(int i=1;i<=n;i++)
        {
            if(step==7)// when its the next monday
            {
               count=start+1;//increase the count by 1 from the previous monday
                start++; // increase the value of start
                step=0;// recount the days till next monday
            } 
            sum+=count;
            count++;step++;
        }
        return sum;
    }
}
