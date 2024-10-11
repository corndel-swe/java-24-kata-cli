package org.kata.pablo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingLettersTest {

    private final MissingLetters missingLetters = new MissingLetters();

    @Test
    public void noLettersShouldReturnAlphabet() {
        assertEquals("abcdefghijklmnopqrstuvwxyz", missingLetters.getMissingLetters(""));
    }

    @Test
    public void singleLetterShouldReturnRestOfAlphabetWithoutCharacter() {
        assertEquals("bcdefghijklmnopqrstuvwxyz", missingLetters.getMissingLetters("a"));
    }

    @Test
    public void multipleLowercaseLettersShouldReturnRestOfAlphabetWithoutCharacters() {
        assertEquals("abcfgijkmnpqstuvxyz", missingLetters.getMissingLetters("hello world"));
    }

    @Test
    public void multipleMixedCaseLettersShouldReturnRestOfAlphabetWithoutCharacters() {
        assertEquals("abcfgijkmnpqstuvxyz", missingLetters.getMissingLetters("hElLo WooooooRlD"));
    }

    @Test
    public void allLettersShouldReturnEmptyString() {
        assertEquals("", missingLetters.getMissingLetters("The quick brown fox jumps over the lazy dog"));
    }

}