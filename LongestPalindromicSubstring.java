/*
    5. Longest Palindromic Substring
    Given a string s, return the longest
palindromic
substring
in s.

 

Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.

Example 2:

Input: s = "cbbd"
Output: "bb"

 */

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        int n = s.length();

        if (n < 2) {
            return s;
        }

        String sub = s.substring(0, 1);
        int curr = 1;

        for (int i = 0; i < n; i++) {

            int start = i, end = i;
            while (start >= 0 && end < n && s.charAt(start) == s.charAt(end)) {

                if (end - start + 1 > curr) {
                    sub = s.substring(start, end + 1);
                    curr = end - start + 1;
                }

                start--;
                end++;
            }

            start = i;
            end = i + 1;
            while (start >= 0 && end < n && s.charAt(start) == s.charAt(end)) {

                if (end - start + 1 > curr) {
                    sub = s.substring(start, end + 1);
                    curr = end - start + 1;
                }

                start--;
                end++;
            }
        }
        return sub;
    }

    public static void main(String[] args) {

    }

}
