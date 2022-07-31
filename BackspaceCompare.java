class BackspaceCompare {
    /*
    Runtime: 1 ms, faster than 94.32% of Java online submissions for Backspace String Compare.
Memory Usage: 40.6 MB, less than 91.02% of Java online submissions for Backspace String Compare.
    */
    public boolean backspaceCompare(String s, String t) {
        StringBuilder s_sb=new StringBuilder();
        StringBuilder t_sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='#' && s_sb.length()>0)
            {
                s_sb.deleteCharAt(s_sb.length()-1);
            }
            else
            {
                if(s.charAt(i)!='#')
                    s_sb.append(s.charAt(i));
            }
        }
        
        for(int i=0;i<t.length();i++)
        {
            if(t.charAt(i)=='#' && t_sb.length()>0)
            {
                t_sb.deleteCharAt(t_sb.length()-1);
            }
            else
            {
                if(t.charAt(i)!='#')
                    t_sb.append(t.charAt(i));
            }
                
        }
        
        return s_sb.toString().equals(t_sb.toString());
    }
}
/*
class BackspaceCompare {
public boolean backspaceCompare(String S, String T) {
	assert S != null && T != null;

    // Iterate to find next pair each time
    int i = S.length() - 1;
    int j = T.length() - 1;
    while (i >= 0 || j >= 0) {
        // Skip deleted elements in both strings, until next effective character
        i = skipBackspaceCharacters(S, i);
        j = skipBackspaceCharacters(T, j);

        // Compare character pair
        if (i >= 0 && j >= 0) {
            if (S.charAt(i) != T.charAt(j)) {
                return false;
            }

            i--;
            j--;
        } else if ((i >= 0) != (j >= 0)) {    // Unmatched indices
            return false;
        }
    }

    return true;
}

private int skipBackspaceCharacters(String s, int index) {
    // Simulate stack in & out sequence with counter
    while (index >= 0 && s.charAt(index) == '#') {
        int count = 1;
        index--;

        while (index >= 0 && count > 0) {
            if (s.charAt(index) == '#') {
                count++;
            } else {
                count--;
            }
            index--;
        }
    }

    return index;
}
}
*/
