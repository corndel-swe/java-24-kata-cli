package org.kata.hala;
import java.util.List;
import java.util.Arrays;
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
        int totalPunctuation = 0;

        List<String> allowedPunctuation = Arrays.asList("(", ")", "{", "}", "[", "]");

        for (char character : input.toCharArray()) {
            if (allowedPunctuation.contains(String.valueOf(character))) {
                totalPunctuation++;
            }
        }

        System.out.println("Total: " + totalPunctuation);

        if (totalPunctuation % 2 == 0) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    public static void main(String[] args) {
        BracketValidator bracketValidator = new BracketValidator();
        bracketValidator.validate("(");
    }
}