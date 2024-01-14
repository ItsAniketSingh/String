/*
    1704
    You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.

    Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.

    Return true if a and b are alike. Otherwise, return false.

    

Example 1:

Input: s = "book"
Output: true
Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
Example 2:

Input: s = "textbook"
Output: false
Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2. Therefore, they are not alike.
Notice that the vowel o is counted twice.


 */



public class DetermineIfStringHalvesAreAlike {
    class Solution {
        public boolean halvesAreAlike(String s) {
            int n = s.length()/2;
            String a = s.substring(0,n+1);
            String b = s.substring(n);
            int aCount = 0;
            int bCount = 0;
            for(int i = 0; i<n; i++){
                char chA = a.charAt(i);
                char chB = b.charAt(i);
                if(chA == 'a' || chA == 'e' || chA == 'i' || chA == 'o' || chA == 'u' || chA == 'A' || chA == 'E' || chA == 'I' || chA == 'O' || chA == 'U'){
                    aCount++;
                }
                if(chB == 'a' || chB == 'e' || chB == 'i' || chB == 'o' || chB == 'u' || chB == 'A' || chB == 'E' || chB == 'I' || chB == 'O' || chB == 'U'){
                    bCount++;
                }
    
            }
            if(aCount == bCount){
                return true;
            }
            return false;
    
        }
    }
    public static void main(String[] args) {
        
    }
}
