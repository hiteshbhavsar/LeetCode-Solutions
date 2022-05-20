class FindJudge {
   public int findJudge(int n, int[][] trust) {
	/*
    Runtime: 3 ms, faster than 74.87% of Java online submissions for Find the Town Judge.
Memory Usage: 69 MB, less than 62.51% of Java online submissions for Find the Town Judge.
    */
	//holds trust count of each villager
    int[] trustCount = new int[n+1];

    for(int i = 0 ; i < trust.length ; i ++  ) {
        trustCount[trust[i][1]]++;
    }

    int judge = -1 ;
    
    for(int villager = 1 ; villager < trustCount.length ; villager++) {
        
		//if the trustcount of a villager is n-1 , then may be he is the judge
        if(trustCount[villager] == n-1) {
            
			//if the judge is already found, return -1 . There cannot be 2 judges
            if(judge != -1)
                return -1;
				
            judge = villager;
        }
    }
	
	//Now check if the suppose to be judge is trusting someone. 
    
    for(int i = 0 ; i < trust.length ; i++) {
       
	   //Judge cannot trust anyone i.e., judge cannot be the 0th element of the inner array
	   
        if(judge == trust[i][0])
            return -1;
    }
        
    return judge;
}
}
