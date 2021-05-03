/*
Runtime: 11 ms, faster than 18.45% of Java online submissions for Ransom Note.
Memory Usage: 39.2 MB, less than 73.55% of Java online submissions for Ransom Note.
*/
class RansomNote {
    
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<magazine.length();i++)
        {
            char c=magazine.charAt(i);
            if(map.containsKey(c))
            {
                map.put(c,map.get(c)+1);
            }
            else
                map.put(c,1);
        }
        
        for(char c : ransomNote.toCharArray())
        {
            if(!map.containsKey(c))
                return false;
            
            else
            {
                int count=map.get(c);
                if(count-1<0)
                    return false;
                map.put(c,map.get(c)-1);
            }
        }
        
        return true;
        
    }
}
