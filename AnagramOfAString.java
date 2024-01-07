/*
    GFG
    Given two strings a and b consisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, act and tac are an anagram of each other.

    Note:-

    If the strings are anagrams you have to return True or else return False

    |s| represents the length of string s.


Example 1:

Input:a = geeksforgeeks, b = forgeeksgeeks
Output: YES
Explanation: Both the string have same characters with
        same frequency. So, both are anagrams.



 */

import java.util.Arrays;

public class AnagramOfAString {
    class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        char[]c1 = a.toCharArray();
        char[]c2 = b.toCharArray();
        if(a.length() != b.length()){
            return false;
        }
        Arrays.sort(c1);
        Arrays.sort(c2);
        
        for(int i = 0; i< a.length(); i++){
            if(c1[i] != c2[i]){
                return false;
            }
        }
        return true;
    }
}
    public static void main(String[] args) {
        
    }
}
