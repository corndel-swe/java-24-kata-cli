package org.kata.damian;

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

// Set work to lowercase to avoid mishaps yeno
        String lowercase = word.toLowerCase();

// List of characters added in using ASCII numbers - found this method online
        List<Character> alphabet = new ArrayList<>();
        for (char letter = 'a'; letter <= 'z'; letter++) {
            alphabet.add(letter);
        }


// Loop through string and remove characters from the list
        for (int i = 0; i < lowercase.length(); i++) {
            char currentChar = lowercase.charAt(i);

            if (alphabet.contains(currentChar)) {
                alphabet.remove(Character.valueOf(currentChar));
            }
        }

// Turn list into a string
        StringBuilder missingLetters = new StringBuilder();
        for (char letter : alphabet) {
            missingLetters.append(letter);
        }

        return missingLetters.toString();
    }
}
