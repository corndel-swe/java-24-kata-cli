package org.kata.michael;

import java.util.Set;
import java.util.HashSet;

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
    String alphabet = "abcdefghijklmnopqrstuvwxyz";

    // convert string into array of characters
    char[] charArray = word.toCharArray();

    // check for empty input
    if (charArray.length == 0) {
      return alphabet;
    }

    // turn array of characters into a set of unique characters
    Set<Character> charSet = new HashSet<>();
    for (char character : charArray) {
      charSet.add(character);
    }

    // turn set of characters into a regex pattern
    StringBuilder regex = new StringBuilder("(?i)[]");
    for (char character : charSet) {
      regex.insert(5, character);
    }

    // filter out letters from alphabet using regex
    return alphabet.replaceAll(regex.toString(), "");
  }
}

