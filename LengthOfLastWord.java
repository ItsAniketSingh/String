/*
    58
    Given a string s consisting of words and spaces, return the length of the last word in the string.

    A word is a maximal 
    substring
    consisting of non-space characters only.

 

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.



 */

class Solution {
    public int lengthOfLastWord(String s) {
       int n = s.length();
       int count = 0;

       while(n != 0){
           if(s.charAt(n-1) == ' ' && count == 0){
               n--;
               continue;
           }
           else{
               if(s.charAt(n-1) == ' '){
                   break;
               }
               count++;
               n--;
           }
       }
       return count;
        
    }
}


public class LengthOfLastWord {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.lengthOfLastWord("This is Aniket"));
    }
}
