class WordBreak {
    /*
    Source: https://www.goodtecher.com/leetcode-139-word-break/
    Runtime: 7 ms, faster than 36.54% of Java online submissions for Word Break.
Memory Usage: 39 MB, less than 68.35% of Java online submissions for Word Break.
    */
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] isWordBreak = new boolean[s.length() + 1];
        
        isWordBreak[0] = true;
        
        for (int i = 0; i < s.length() + 1; i++) {
            for (int j = 0; j < i; j++) {
                if (!isWordBreak[j]) {
                    continue;
                }
                
                if (wordDict.contains(s.substring(j, i))) {
                    isWordBreak[i] = true;
                    break;
                }
            }
        }
        
        return isWordBreak[s.length()];
    }
}
