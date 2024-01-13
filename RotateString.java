/*
    796
    Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

    A shift on s consists of moving the leftmost character of s to the rightmost position.

    For example, if s = "abcde", then it will be "bcdea" after one shift.
    

Example 1:

Input: s = "abcde", goal = "cdeab"
Output: true
Example 2:

Input: s = "abcde", goal = "abced"
Output: false
 */


public class RotateString {
    
    class Solution {
        public static boolean rotate(String goal, String newS, int i ){
            if(i == goal.length()){
                return false;
            }
            if(goal.equals(newS)){
                return true;
            }
            char ch = newS.charAt(0);
            return rotate(goal, newS.substring(1)+ch, i+1);
        }
        public boolean rotateString(String s, String goal) {
            return rotate(goal,s,0);
        }
    }
    public static void main(String[] args) {
        
    }
}
