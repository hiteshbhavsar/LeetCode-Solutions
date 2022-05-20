/* The knows API is defined in the parent class Relation.
      boolean knows(int a, int b); */

public class FindCelebrity extends Relation {
    /*
    Runtime: 28 ms, faster than 28.26% of Java online submissions for Find the Celebrity.
Memory Usage: 54.1 MB, less than 45.27% of Java online submissions for Find the Celebrity.
    */
    private int numberOfPeople;
    
    public int findCelebrity(int n) {
        numberOfPeople = n;
        for (int i = 0; i < n; i++) {
            if (isCelebrity(i)) {
                return i;
            }
        }
        return -1;
    }
    
    private boolean isCelebrity(int i) {
        for (int j = 0; j < numberOfPeople; j++) {
            if (i == j) continue; // Don't ask if they know themselves.
            if (knows(i, j) || !knows(j, i)) {
                return false;
            }
        }
        return true;
    }
}
