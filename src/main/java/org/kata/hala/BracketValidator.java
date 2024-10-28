package org.kata.hala;
import java.util.*;

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

        HashMap<Character, Character> allowedPunctuation = new HashMap<>(Map.of(
                '(', ')',
                '[', ']',
                '{', '}'
        ));

        Stack<Character> stack = new Stack<>();
        for (char character : input.toCharArray()) {
            //  check open bracket
            if (allowedPunctuation.containsKey(character)) {
                stack.push(character);
                // check closing bracket
            } else if (allowedPunctuation.containsValue(character))
            {
                // check if the stack is empty
                // check if the last added bracket is doesnt equal the current character
            if (stack.isEmpty() || allowedPunctuation.get(stack.pop()) != character)
                return false;
            }}

        return true;
    }
}