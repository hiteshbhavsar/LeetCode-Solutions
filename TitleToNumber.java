class TitleToNumber {
    public int titleToNumber(String s) {
        /*Runtime: 2 ms, faster than 82.08% of Java online submissions for Excel Sheet Column Number.
Memory Usage: 42.4 MB, less than 78.11% of Java online submissions for Excel Sheet Column Number.*/
        int ans=0;
        int p=0;
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            int val=(int)c-65+1;
            ans+=val*Math.pow(26,p);
            p++;
        }
        return ans;
        
    }
}
