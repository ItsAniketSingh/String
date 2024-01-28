/*
    2108
    Given an array of strings words, return the first palindromic string in the array. 
    If there is no such string, return an empty string "".

    A string is palindromic if it reads the same forward and backward.

 

Example 1:

Input: words = ["abc","car","ada","racecar","cool"]
Output: "ada"
Explanation: The first string that is palindromic is "ada".
Note that "racecar" is also palindromic, but it is not the first.
Example 2:

Input: words = ["notapalindrome","racecar"]
Output: "racecar"
Explanation: The first and only string that is palindromic is "racecar".


*/



public class FindFirstPalindromicStringInTheArray {
    static class Solution {
        public boolean isPalindrom(CreateString s){
            int i =0;
            int n = s.length()-1;
            while(i<n){
                if(s.charAt(i) != s.charAt(n)){
                    return false;
                }
                i++;
                n--;
            }
            return true;
        }
        public CreateString firstPalindrome(CreateString[] words) {
    
            for(CreateString s : words){
                if(isPalindrom(s)){
                    return s;
                }
            }
            return "";
            
        }
    }
    public static void main(CreateString[] args) {
        CreateString[]  words = {"notapalindrome","racecar"};

       
    }
}
