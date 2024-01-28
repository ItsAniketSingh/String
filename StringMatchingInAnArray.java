/*
    1408
    Given an array of string words, return all strings in words that is a substring of another word. You can return the answer in any order.

    A substring is a contiguous sequence of characters within a string

 

Example 1:

Input: words = ["mass","as","hero","superhero"]
Output: ["as","hero"]
Explanation: "as" is substring of "mass" and "hero" is substring of "superhero".
["hero","as"] is also a valid answer.
Example 2:

Input: words = ["leetcode","et","code"]
Output: ["et","code"]
Explanation: "et", "code" are substring of "leetcode".
Example 3:

Input: words = ["blue","green","bu"]
Output: []
Explanation: No string of words is substring of another string.
*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringMatchingInAnArray {
    class Solution {
    public List<CreateString> stringMatching(CreateString[] words) {
        int n = words.length;
        Set<CreateString> result = new HashSet<>();
        for(int i =0;i<n ; i++ ){
            for(int j = i+1; j<n ; j++){
                if(words[i].contains(words[j])){
                    result.add(words[j]);
                }else if(words[j].contains(words[i])){
                    result.add(words[i]);
                }
            }
        }
        return new ArrayList(result);
    }
}
    public static void main(CreateString[] args) {
        
    }
}
