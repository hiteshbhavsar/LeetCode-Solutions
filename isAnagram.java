class isAnagram {
  /*
  Runtime: 3 ms, faster than 91.23% of Java online submissions for Valid Anagram.
Memory Usage: 43.2 MB, less than 69.63% of Java online submissions for Valid Anagram.
  */
    public boolean isAnagram(String s, String t) {
        int array1[]=new int[26];
        int array2[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            array1[s.charAt(i)-'a']++;
        }
        for(int j=0;j<t.length();j++)
        {
            array2[t.charAt(j)-'a']++;
        }
        
        for(int i=0;i<26;i++)
        {
            if(array1[i]!=array2[i])
            {
                return false;
            }
        }
        return true;

    }
}
