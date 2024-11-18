package org.kata.charlie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class HangmanSetTest {

    private HangmanSet hangmanSet;

    @BeforeEach
    public void setUp() {
        hangmanSet = new HangmanSet("hello");
    }

    @Test
    public void guessCorrectLetterShouldReturnTrue() {
        assertTrue(hangmanSet.guess('h'));
    }


    @Disabled
    @Test
    public void guessIncorrectLetterShouldReturnFalse() {
        assertFalse(hangmanSet.guess('z'));
    }

    @Disabled
    @Test
    public void guessNonLetterShouldThrowIllegalArgumentException() {
        Character[] nonLetters = {'1', '.', ' ', '@'};
        for (Character nonLetter : nonLetters) {
            assertThrows(IllegalArgumentException.class, () -> hangmanSet.guess(nonLetter));
        }
    }

    @Disabled
    @Test
    public void guessAlreadyGuessedLetterShouldThrowIllegalArgumentException() {
        hangmanSet.guess('h');
        hangmanSet.guess('l');
        assertThrows(IllegalArgumentException.class, () -> hangmanSet.guess('h'));
        assertThrows(IllegalArgumentException.class, () -> hangmanSet.guess('l'));
    }

    @Disabled
    @Test
    public void getGuessedLettersShouldReturnGuessedLetters() {
        hangmanSet.guess('h');
        hangmanSet.guess('e');
        hangmanSet.guess('x');
        hangmanSet.guess('w');
        Set<Character> guessedLetters = hangmanSet.getGuessedLetters();
        assertTrue(guessedLetters.contains('h'));
        assertTrue(guessedLetters.contains('e'));
        assertTrue(guessedLetters.contains('x'));
        assertTrue(guessedLetters.contains('w'));
        assertEquals(guessedLetters.size(), 4);
    }

    @Disabled
    @Test
    public void getRemainingLettersShouldReturnRemainingLetters() {
        hangmanSet.guess('a');
        hangmanSet.guess('b');
        Set<Character> remainingLetters = hangmanSet.getRemainingLetters();
        assertFalse(remainingLetters.contains('a'));
        assertFalse(remainingLetters.contains('b'));
        for (char i = 'c'; i <= 'z'; i++) {
            assertTrue(remainingLetters.contains(i));
        }
    }

    @Disabled
    @Test
    public void isWordGuessedWordGuessedShouldReturnTrue() {
        hangmanSet.guess('h');
        hangmanSet.guess('e');
        hangmanSet.guess('l');
        hangmanSet.guess('o');
        assertTrue(hangmanSet.isWordGuessed());
    }

    @Disabled
    @Test
    public void isWordGuessedWordNotGuessedShouldReturnFalse() {
        hangmanSet.guess('h');
        hangmanSet.guess('e');
        hangmanSet.guess('l');
        assertFalse(hangmanSet.isWordGuessed());
    }
}
