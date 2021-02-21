class isPalindrome {
    public boolean isPalindrome(String s) {
        /*
        Runtime: 163 ms, faster than 6.93% of Java online submissions for Valid Palindrome.
        Memory Usage: 40.4 MB, less than 17.45% of Java online submissions for Valid Palindrome.
        */
        s=s.toLowerCase();
        char [] alphabets=s.toCharArray();String s1="";
        for(int i=0;i<alphabets.length;i++)
        {
            int j=(int)alphabets[i];
            if((j>96 && j<123) || (j>64 && j<91)||(j>47 && j<58))
            {
                s1+=alphabets[i];    
            }
        }
        int a=0,b=s1.length()-1;
        while(a<b)
        {
            if(s1.charAt(a)!=s1.charAt(b))
            {
                return false; //Comes true if there is any character which doesn't match at a and b. Basically the string is not a palindrome
            }
            a++;b--;
        }
        return true; // If everything matches then 
    }
}
