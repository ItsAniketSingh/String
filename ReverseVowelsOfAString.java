/*
    345
    Given a string s, reverse only all the vowels in the string and return it.

    The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

Example 1:

Input: s = "hello"
Output: "holle"
Example 2:

Input: s = "leetcode"
Output: "leotcede"



*/




public class ReverseVowelsOfAString {
    class Solution {
        public CreateString reverseVowels(CreateString s) {
            int i = 0; 
            int n = s.length()-1;
            char temp;
            char [] ch = s.toCharArray();
            while(i<n){
                if( (ch[i] == 'a' || ch[i] == 'A' || ch[i] == 'e' || ch[i] == 'E' || ch[i] == 'i' || ch[i] == 'I' || ch[i] == 'o' || ch[i] == 'O' || ch[i] == 'u' || ch[i] == 'U') && (ch[n] == 'a'|| ch[n] == 'A' || ch[n] == 'e' || ch[n] == 'E' || ch[n] == 'i' || ch[n] == 'I' || ch[n] == 'o' || ch[n] == 'O' || ch[n] == 'u' || ch[n] == 'U')){
                    temp = ch[i];
                    ch[i] = ch[n];
                    ch[n] = temp;
                    i++;
                    n--;
                }
            else if(!(ch[i] == 'a' || ch[i] == 'A' || ch[i] == 'e' || ch[i] == 'E' || ch[i] == 'i' || ch[i] == 'I' || ch[i] == 'o' || ch[i] == 'O' || ch[i] == 'u' || ch[i] == 'U')){
                n--;
            }
            else if(!(ch[n] == 'a'|| ch[n] == 'A' || ch[n] == 'e' || ch[n] == 'E' || ch[n] == 'i' || ch[n] == 'I' || ch[n] == 'o' || ch[n] == 'O' || ch[n] == 'u' || ch[n] == 'U')){
                i++;
            }
    
    
            }
            CreateString result = new CreateString(ch);
            return result;
    
    
            
        }
    }
    public static void main(CreateString[] args) {
        
    }
}
