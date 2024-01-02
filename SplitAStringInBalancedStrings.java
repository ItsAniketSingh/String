/*
    1221
    Balanced strings are those that have an equal quantity of 'L' and 'R' characters.

    Given a balanced string s, split it into some number of substrings such that:

    Each substring is balanced.
    Return the maximum number of balanced strings you can obtain.

 

Example 1:

Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.



 */



 class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int cha = 0;

        for(int i =0 ; i< s.length();i++){
            if(s.charAt(i) == 'R'){
                cha++;
            }
            else{
                cha--;
            }
            if(cha == 0){
                count++;
            }
        }
        return count;
    }
}

public class SplitAStringInBalancedStrings 
{
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.balancedStringSplit("RLRRLLRLRL"));
        
    }
    
}
