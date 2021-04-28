class IsIsomorphicStings {
    /*
    Runtime: 7 ms, faster than 61.67% of Java online submissions for Isomorphic Strings.
Memory Usage: 39 MB, less than 37.70% of Java online submissions for Isomorphic Strings.
    */
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> hs = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (hs.containsKey(c1)) {
                if (hs.get(c1).equals(c2)) {
                    continue;
                } else {
                    return false;
                }

            } else {
                if (hs.containsValue(c2)) {
                    return false;
                } else {
                    hs.put(c1, c2);
                }
            }
        }
        return true;
    }
}
