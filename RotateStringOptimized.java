<<<<<<< HEAD
<<<<<<< HEAD

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


public class RotateStringOptimized {
    class Solution {
        public boolean rotateString(String s, String goal) {
    
            
    
            // find length of start string
            int n1 = s.length();
    
            // find length of goal string
            int n2 = goal.length();
    
            // Step1:
            // if they are unequal then, start cannot be converted to goal
            if(n1 != n2)
            {
                return false;
            }
    
            // We use StringBuilder as we are modifying the string
            // String cannot be used as they are immutable.
            StringBuilder str = new StringBuilder(goal);
    
            // Step2:
            // repeat the goal string.
            str=str.append(str);
    
            // Step3 and Step4:
            // if start string is present in it then return true.
            // otherwise return false
            
            return (str.indexOf(s)!=-1);   
    
            /*
            The return statement can be expanded as:
                    if(str.indexOf(s)!=-1)
                    {
                         return true;
                    }
                    else
                    {
                         return false;
                    }
            */   
        }
    }
    public static void main(String[] args) {
        
    }
}
=======
=======
>>>>>>> f92187842182238ee0372fa5bbf49c655bfcfe14

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


public class RotateStringOptimized {
    class Solution {
        public boolean rotateString(String s, String goal) {
    
            
    
            // find length of start string
            int n1 = s.length();
    
            // find length of goal string
            int n2 = goal.length();
    
            // Step1:
            // if they are unequal then, start cannot be converted to goal
            if(n1 != n2)
            {
                return false;
            }
    
            // We use StringBuilder as we are modifying the string
            // String cannot be used as they are immutable.
            StringBuilder str = new StringBuilder(goal);
    
            // Step2:
            // repeat the goal string.
            str=str.append(str);
    
            // Step3 and Step4:
            // if start string is present in it then return true.
            // otherwise return false
            
            return (str.indexOf(s)!=-1);   
    
            /*
            The return statement can be expanded as:
                    if(str.indexOf(s)!=-1)
                    {
                         return true;
                    }
                    else
                    {
                         return false;
                    }
            */   
        }
    }
    public static void main(String[] args) {
        
    }
}
<<<<<<< HEAD
>>>>>>> f921878 (String Problems)
=======
>>>>>>> f92187842182238ee0372fa5bbf49c655bfcfe14
