class ReverseWordString2 {
    /*
    Runtime: 2 ms, faster than 70.33% of Java online submissions for Reverse Words in a String II.
Memory Usage: 55.9 MB, less than 17.18% of Java online submissions for Reverse Words in a String II.
    */
    public void reverse(char[] s, int left, int right) {
        while (left < right) {
            char tmp = s[left];
            s[left++] = s[right];
            s[right--] = tmp;
        }
    }

    public void reverseEachWord(char[] s) {
        int n = s.length;
        int start = 0, end = 0;

        while (start < n) {
            // go to the end of the word
            while (end < n && s[end] != ' ') ++end;
            // reverse the word
            reverse(s, start, end - 1);
            // move to the next word
            start = end + 1;
            ++end;
        }
    }

    public void reverseWords(char[] s) {
        // reverse the whole string
        reverse(s, 0, s.length - 1);

        // reverse each word
        reverseEachWord(s);
    }
}
