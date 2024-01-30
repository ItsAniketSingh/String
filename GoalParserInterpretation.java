/*
    1678
    You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)" in some order.
    The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". 
    The interpreted strings are then concatenated in the original order.

    Given the string command, return the Goal Parser's interpretation of command.



 
*/




public class GoalParserInterpretation {
    public String interpret(String command) {
        command = command.replace("()", "o");
        command = command.replace("(al)","al");
        return command;
        
    }
    public static void main(String[] args) {
        
    }
}
