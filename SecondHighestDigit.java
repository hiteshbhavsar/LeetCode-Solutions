class SecondHighestDigit {
    /*
    Runtime: 8 ms, faster than 15.67% of Java online submissions for Second Largest Digit in a String.
Memory Usage: 39.5 MB, less than 23.99% of Java online submissions for Second Largest Digit in a String.
    */
    public int secondHighest(String s) {
        ArrayList<Integer> set=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                int k=Integer.parseInt(s.charAt(i)+"");
                if(!set.contains(k))
                    set.add(k);
            }
        }
        if(set.size()<2) return -1;
        else{
            Collections.sort(set);
            return set.get(set.size()-2);
            }
    }   
}
