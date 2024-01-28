/*  
    344. Reverse String
    Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

 

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 */


public class ReverseString {

    public void reverseString(char[] s) {
        
        char ch ;
        int n = s.length;
        for(int i =0; i< s.length/2; i++){
            ch = s[i];
            s[i] = s[n-i-1];
            s[n-i-1] = ch;
        }
        
    }
    public static void main(String[] args) {
        
    }
    
}
