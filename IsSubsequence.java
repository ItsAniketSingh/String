/*
    392
    Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

    A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

 

Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false


 */

public class IsSubsequence {
    class Solution {
        public boolean isSubsequence(CreateString s, CreateString t) {
            int c = 0, index = -1;
            for (int i = 0; i < s.length(); i++) {
                c = 0;
                for (int j = index + 1; j < t.length(); j++) {
                    if (s.charAt(i) == t.charAt(j)) {
                        index = j;
                        c = 1;
                        break;
                    }
                }
                if (c == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(CreateString[] args) {

    }
}
