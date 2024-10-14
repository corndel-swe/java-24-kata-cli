package org.kata.anna;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

        // Create missing letters list
        List<String> missingLetters = new ArrayList<>();

        // make word lowercase
        String lowercaseWord = word.toLowerCase();

        // define characters to check against
        String alphabetString = "abcdefghijklmnopqrstuvwxyz";

        // Split alphabet into list for checking
        String[] alphabet = alphabetString.split("");

        // For each letter in alphabet, if missing add to missingletters list
        for (var i : alphabet){
            var result = !lowercaseWord.contains(i) ? missingLetters.add(i) : null;
        }
        // Join the list into a string and print and return
        String finalList = String.join(", ", missingLetters);
        String returnItem = finalList.equals("") ? "There are no missing letters" : finalList;
        System.out.println(returnItem);
        return returnItem;
    }


    // for testing
    public static void main(String[] args) {
        String word = "abcdefghijklmnopqrstuvwxyz";
        MissingLetters help = new MissingLetters();

        help.getMissingLetters(word);
    }
}

