class GenerateParenthesis {
    List<String> list = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        
        char str[] = new char[2*n];
        generate(str,0, n, n);
        
        return list;
    }
    
    public void generate(char str[],int i, int o, int c)
    {
        if(o==0 && c==0)
        {
            list.add(new String(str));
            return;
        }
        else
        {
            if(o>0 && o<=c)
            {
                str[i] = '(';
                generate(str, i+1, o-1, c);
            }
            if(c>0 && o<c)
            {
                str[i] = ')';
                generate(str, i+1, o, c-1);
            }    
        }
    }
}
