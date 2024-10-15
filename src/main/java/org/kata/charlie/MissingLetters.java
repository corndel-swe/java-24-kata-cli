package org.kata.charlie;

import java.util.HashSet;
import java.util.Set;

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
        if (word == null || word.isEmpty()) {
            return "abcdefghijklmnopqrstuvwxyz";
        }

        String lowerCase = word.toLowerCase();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        Set<Character> missingLetterSet = new HashSet<>();

        for (char letter : alphabet) {
            missingLetterSet.add(letter);
        }

        for (int i = 0; i < lowerCase.length(); i++) {
            missingLetterSet.remove(lowerCase.charAt(i));
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (char letter : missingLetterSet) {
            stringBuilder.append(letter);
        }

        return stringBuilder.toString();
    }
}

