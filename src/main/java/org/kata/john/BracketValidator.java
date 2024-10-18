package org.kata.john;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BracketValidator {

    /**
     * Validates the proper nesting of braces, brackets, and parentheses in the given input string.
     * <p>
     * Returns a boolean to determine whether all openers '(', '{', '[' and their corresponding
     * closers ')', '}', ']' in the input string are properly nested and balanced.
     * <p>
     * The input string can contain any characters, but only the brackets are considered for validation.
     *
     * @param input the string to validate for proper nesting of brackets
     * @return {@code true} if the input string's openers and closers are properly nested;
     * {@code false} otherwise
     */
    public static boolean validate(String input) {
        // https://stackoverflow.com/questions/237061/using-regular-expressions-to-extract-a-value-in-java
        // https://stackoverflow.com/questions/51687766/using-regex-g-flag-in-java

        // extract only the brackets
        Pattern pattern = Pattern.compile("[({\\[\\]})]");
        Matcher matcher = pattern.matcher(input);
        String brackets = "";
        // collect the brackets
        while(matcher.find()){
            brackets += matcher.group();
        }
        // no brackets? --> false
        if(brackets.isEmpty()){
            return false;
        // odd number of brackets? --> false
        } else if(brackets.length() % 2 != 0){
            return false;
        }

        // even number of brackets? need to check if balanced.

        // make a stack
        Stack<String> stack = new Stack<>();

        String closing = ")}]";

        // loop over each bracket
        for(String c: brackets.split("")){
            // is it a closing bracket?
            if(closing.contains(c)){
                // is the corresponding opener at the top of the stack?
                if(     c.equals(")") && stack.peek().equals("(") ||
                        c.equals("}") && stack.peek().equals("{") ||
                        c.equals("]") && stack.peek().equals("[")) {
                    // --> remove the opener from the stack
                    stack.pop();
                } else {
                    return false;
                }
            // if it's an opening bracket, add it to the stack
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input = "(({{[]}}))";
        System.out.println(input + " Expected: true, actual: " + validate(input)); // should be true
        System.out.println();

        input = "{{(())}";
        System.out.println(input + " Expected: false, actual: " + validate(input)); // // should be false
        System.out.println();

        input = "{{(())})";
        System.out.println(input + " Expected: false, actual: " + validate(input)); // // should be false
        System.out.println();

        input = "abcdfr";
        System.out.println(input + " Expected: false, actual: " + validate(input)); // // should be false
        System.out.println();

        input = "a(b[c{d}f]r)123";
        System.out.println(input + " Expected: true, actual: " + validate(input)); // // should be false
        System.out.println();
    }
}
