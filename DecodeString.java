class DecodeString {
    public String decodeString(String s) {
        /*
        Runtime: 1 ms, faster than 84.91% of Java online submissions for Decode String.
Memory Usage: 40.3 MB, less than 87.19% of Java online submissions for Decode String.
        
        */
        if (s == null || s.length() == 0) {
            return null;
        }
        Stack<Integer> inStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        StringBuilder cur = new StringBuilder();
        int mult = 0;
        
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                mult = mult * 10 + (ch - '0');
            } else if (ch == '[') {
                inStack.push(mult);
                mult = 0;
                strStack.push(cur);
                cur = new StringBuilder();
            } else if (ch == ']') {
                StringBuilder tmp = cur;
                cur = strStack.pop();
                for (int i = inStack.pop(); i > 0; i--) {
                    cur.append(tmp);
                }
            } else {
                cur.append(ch);
            }
        }
        return cur.toString();
    }
}
