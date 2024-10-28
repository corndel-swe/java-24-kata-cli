package org.kata.john;

import java.util.HashSet;
import java.util.Set;

/**
 * A Set is a collection that ensures all elements are unique.
 * It’s part of the java.util package and is useful for storing non-duplicate items.
 * Sets, especially HashSet, provide quick look-up times for elements.
 * <a href="https://www.geeksforgeeks.org/set-in-java/">Set in Java</a>
 * <p>
 * The HangmanSet class represents a simple hangman game using a set to store guessed letters.
 */
public class HangmanSet {

    private final String word;
    private final Set<Character> guessedLetters;

    /**
     * Constructs a new HangmanSet with the specified word.
     *
     * @param word the word to be guessed in the hangman game
     */
    public HangmanSet(String word) {
        this.word = word;
        this.guessedLetters = new HashSet<>();
    }

    /**
     * Makes a guess with the specified letter.
     *
     * @param letter the letter being guessed
     * @return true if the letter is in the word, false otherwise
     * @throws IllegalArgumentException if the given letter is not a letter or has already been guessed.
     */
    public boolean guess(char letter) throws IllegalArgumentException {
        return true;
    }

    /**
     * Returns a set of guessed letters.
     *
     * @return a set of characters representing the guessed letters
     */
    public Set<Character> getGuessedLetters() {
        return null;
    }

    /**
     * Returns a set of remaining letters to be guessed.
     *
     * @return a set of characters representing the remaining letters to be guessed
     */
    public Set<Character> getRemainingLetters() {
        return null;
    }

    /**
     * Checks if all letters in the word have been guessed.
     *
     * @return true if all letters in the word have been guessed, false otherwise
     */
    public boolean isWordGuessed() {
        return true;
    }
}


