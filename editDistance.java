class editDistance {
/*

  Runtime: 5 ms, faster than 65.47% of Java online submissions for Edit Distance.
  Memory Usage: 39.5 MB, less than 25.49% of Java online submissions for Edit Distance.

*/


    public int minDistance(String word1, String word2) {
        return editDistance(word1,word2,word1.length(),word2.length());
    }
    static int editDistance(String str1, String str2, int m, int n) 
    { 
        // Create a table to store results of subproblems 
        int dp[][] = new int[m + 1][n + 1]; 
  
        // Fill d[][] in bottom up manner 
        for (int i = 0; i <= m; i++) { 
            for (int j = 0; j <= n; j++) { 
                // If first string is empty, only option is to 
                // insert all characters of second string 
                if (i == 0) 
                    dp[i][j] = j; // Min. operations = j 
  
                // If second string is empty, only option is to 
                // remove all characters of second string 
                else if (j == 0) 
                    dp[i][j] = i; // Min. operations = i 
  
                // If last characters are same, ignore last char 
                // and recur for remaining string 
                else if (str1.charAt(i - 1) == str2.charAt(j - 1)) 
                    dp[i][j] = dp[i - 1][j - 1]; 
  
                // If the last character is different, consider all 
                // possibilities and find the minimum 
                else
                    dp[i][j] = 1 + Math.min(Math.min(dp[i][j - 1], // Insert 
                                       dp[i - 1][j]), // Remove 
                                       dp[i - 1][j - 1]); // Replace 
            } 
        } 
  
        return dp[m][n]; 
    } 
    /*
    public int editDistance(String s1,String s2,int m,int n)
    {
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if((i==0 && j==0)||i==0||j==0)
                    dp[i][j]=0;
                
                if(s1.charAt(i-1)==s1.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1];
                }
                else
                {
                    dp[i][j]=1+Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1]);
                }
            }
        }    
        return dp[m][n];
    }
    */
}
