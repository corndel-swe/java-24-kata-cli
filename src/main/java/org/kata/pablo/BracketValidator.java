package org.kata.pablo;

import java.util.List;
import java.util.Map;
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
        Map<Character, Character> brackets = Map.of('(', ')', '{', '}', '[', ']');
        Stack<Character> stack = new Stack<>();

        for (char x : input.toCharArray()) {
            if (brackets.containsKey(x)) {
                stack.push(x);
            } else if (brackets.containsValue(x) && brackets.get(stack.pop()) != x) {
                return false;
            }
        }

        return true;
    }
}

