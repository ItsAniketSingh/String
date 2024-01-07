/*
    GFG
    Given a string S, check if it is palindrome or not.

Example 1:

Input: S = "abba"
Output: 1
Explanation: S is a palindrome
 */


public class PalindromeString {
    class Solution {
        int isPalindrome(String S) {
            // code here
            int n = S.length();
            for(int i = 0;i < (n/2); i++){
                if(S.charAt(i) != S.charAt(n-i-1)){
                    return 0;
                }
            }
            return 1;
        }
    };
    public static void main(String[] args) {
        
    }
}
