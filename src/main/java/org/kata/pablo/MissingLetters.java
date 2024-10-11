package org.kata.pablo;

import java.util.ArrayList;
import java.util.List;

public class MissingLetters {

    /**
     * Returns a string containing all the alphabetical characters that do not appear
     * in the given input string. The result is case-insensitive and consists of
     * missing letters in alphabetical order.
     *
     * @param word the input string to check for missing alphabetical characters
     * @return a string of missing letters in alphabetical order, or an empty string if no letters are missing
     * <p>
     * hints:
     * - Only the 26 letters of the English alphabet (a-z) are considered.
     * - The result should be in lowercase and in alphabetical order.
     * - Non-alphabetical characters (numbers, spaces, punctuation) are ignored.
     */
    public String getMissingLetters(String word) {
        List<Character> alphabet = new ArrayList<>();
        for (char i = 'a'; i <= 'z'; i++) {
            alphabet.add(i);
        }

        String lowerWord = word.toLowerCase();
        for (Character i : lowerWord.toCharArray()) {
            if (Character.isLetter(i)) {
                alphabet.remove(i);
            }
        }

        StringBuilder result = new StringBuilder();
        for (Character i : alphabet) {
            result.append(i);
        }

        return result.toString();
    }
}

