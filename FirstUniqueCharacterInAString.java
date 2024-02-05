/*
    387. First Unique Character in a String
    Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

 

Example 1:

Input: s = "leetcode"
Output: 0
Example 2:

Input: s = "loveleetcode"
Output: 2
Example 3:

Input: s = "aabb"
Output: -1
 */


public class FirstUniqueCharacterInAString {

    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);
            if (i == s.lastIndexOf(c) && i == s.indexOf(c)) return i;
        }

        return -1;

    }
    public static void main(String[] args) {
        
    }
    
}
