class EvalRPN {
    public int evalRPN(String[] tokens) {
        /*
        Runtime: 31 ms, faster than 6.97% of Java online submissions for Evaluate Reverse Polish Notation.
Memory Usage: 45.8 MB, less than 5.09% of Java online submissions for Evaluate Reverse Polish Notation.
        */
        Stack<String> operand=new Stack<>();
       
        
        for(int i=0;i<tokens.length;i++)
        {
            if(tokens[i].equals("+")
               ||tokens[i].equals("-")
               ||tokens[i].equals("*")
               ||tokens[i].equals("/"))
            {
                String operation="";
                int result=0;
                operation=tokens[i];
                if(!operand.isEmpty())
                {
                    int secondoperand=Integer.parseInt(operand.pop());
                    int firstoperand=Integer.parseInt(operand.pop());
                    
                   
                    switch(operation)
                    {
                        case "+": result=firstoperand+secondoperand;break;
                        case "-": result=firstoperand-secondoperand;break;
                        case "*": result=firstoperand*secondoperand;break;
                        case "/": result=firstoperand/secondoperand;break;
                        default : break;
                    }
                    operand.push(result+"".trim());
                }
            }
            else
            {
                operand.push(tokens[i]);
            }
        }
        
        return Integer.parseInt(operand.pop());
    }
}
