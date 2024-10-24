package org.kata.john;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    public static String getMissingLetters(String word) {
        // create a hashset of the alphabet
        // using LinkedHashSet to ensure that alphabetical order is maintained
        String alphabet ="abcdefghijklmnopqrstuvwxyz";
        LinkedHashSet<String> alphabetSet = new LinkedHashSet<>(Arrays.asList(alphabet.split("")));

        // get only the letters from the input string
        Pattern pattern = Pattern.compile("[a-z]");
        Matcher matcher = pattern.matcher(word.toLowerCase());
        while(matcher.find()){
            alphabetSet.remove(matcher.group());
        }

        // return remaining letters as a string
        return String.join("", alphabetSet);
    }
}

