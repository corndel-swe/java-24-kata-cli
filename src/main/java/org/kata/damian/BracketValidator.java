package org.kata.damian;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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

    public boolean validate(String input) {
        // Stack uses a last in first out method which works well for this
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            else if (ch == ')' || ch == '}' || ch == ']') {
                // return false if closing bracket at start
                if (stack.isEmpty()) {
                    return false;
                }
                // Pop the last/latest opening bracket
                char top = stack.pop();

                // Check if the popped bracket matches the current closing bracket - if it doesn't return false, else continue
                if ((top == '(' && ch != ')') ||
                        (top == '{' && ch != '}') ||
                        (top == '[' && ch != ']')) {
                    return false;
                }
            }
        }

        // If the stack is empty, all brackets are matched, otherwise return false
        return stack.isEmpty();
    }
}
