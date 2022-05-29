class HasGroupsSizeX {
    public boolean hasGroupsSizeX(int[] deck) {
        /*
        Runtime: 5 ms, faster than 86.97% of Java online submissions for X of a Kind in a Deck of Cards.
Memory Usage: 54.1 MB, less than 9.31% of Java online submissions for X of a Kind in a Deck of Cards.
        */
        int N = deck.length;
        int[] count = new int[10000];
        for (int c: deck)
            count[c]++;

        List<Integer> values = new ArrayList();
        for (int i = 0; i < 10000; ++i)
            if (count[i] > 0)
                values.add(count[i]);

        search: for (int X = 2; X <= N; ++X)
            if (N % X == 0) {
                for (int v: values)
                    if (v % X != 0)
                        continue search;
                return true;
            }

        return false;
    }
}
