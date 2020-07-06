/**********************************************************************************************************
Author : Hitesh Bhavsar
Problem :Find Smallest Letter Greater Than Target (744)
Problem Link: https://leetcode.com/problems/find-smallest-letter-greater-than-target/
**********************************************************************************************************/

class NextGreatestLetter {
    public char nextGreatestLetter(char[] letters, char target) {
        //Taking integer value in max
        int max=(int)target;
        for(int i=0;i<letters.length;i++)
        {
            if(letters[i]==target) continue; // check if the character and target are same
            
            if((int)letters[i]>max) // checking if there is any character greater than the target
                return letters[i];
        }
        // if no character is found in the array then it means that you need to search for wrap around
        return letters[0];
    }
}
