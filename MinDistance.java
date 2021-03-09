class Solution {
    public int minDistance(String word1, String word2) {
//if(word1.length() == 0 && word2.length() == 0) return 0;
        /*
        Runtime: 7 ms, faster than 84.20% of Java online submissions for Delete Operation for Two Strings.
Memory Usage: 40.1 MB, less than 26.09% of Java online submissions for Delete Operation for Two Strings.
        */
        if(word1.length() == 0) return word2.length();
        
        if(word2.length() == 0) return word1.length();
        
        int m = word1.length();
        int n = word2.length();
        int[][] cost = new int[m+1][n+1]; //Heare we are maintaining the no of deletion required to reach 0th index
        for(int i=0;i<m+1;i++) {
            cost[i][0] = i;
        }
        for(int j=0;j<n+1;j++) {
            cost[0][j] = j;
        }
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                if(word1.charAt(i) == word2.charAt(j))
                    cost[i+1][j+1] = cost[i][j];
                else 
                    cost[i+1][j+1] = 1 + Math.min(cost[i+1][j], cost[i][j+1]);
        return cost[m][n];     
    }
}
