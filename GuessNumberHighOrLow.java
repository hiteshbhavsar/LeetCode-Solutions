/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class GuessNumberHighOrLow extends GuessGame {
    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Guess Number Higher or Lower.
Memory Usage: 35.6 MB, less than 72.08% of Java online submissions for Guess Number Higher or Lower.
    */
    public int guessNumber(int n) {
        int low=0;
        int high=n;int target=0;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            target=guess(mid);
            int result = guess(mid);
            if(result==0){
            return mid;
            }else if(result==1){
            low = mid+1;
            }else{
            high=mid-1;
            }
        }
        return -1;
    }
}
