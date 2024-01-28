/*

    GFG
    Given a String S , print the reverse of the string as output.

Example 1:

Input: S = "GeeksforGeeks"
Output: "skeeGrofskeeG" 
Explanation: Element at first is at last and
last is at first, second is at second last and 
second last is at second position and so on .




 */








public class ReverseAString {
    class Solution {
        static CreateString revStr(CreateString S) {
            
            // code here
            
            CreateString newS = "";
            int n = S.length();
            for(int i = n-1; i>=0 ; i--){
                newS+=S.charAt(i);
            }
            return newS;
        }
    }
    public static void main(CreateString[] args) {
        
    }
}
