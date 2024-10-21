package org.kata.pablo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketValidatorTest {

    private final BracketValidator validator = new BracketValidator();

    @Test
    public void shouldReturnTrueForBalancedBrackets() {
        assertTrue(validator.validate("{ [] ( ) }"));
    }

    @Test
    public void shouldReturnFalseForMissingCloser() {
        assertFalse(validator.validate("{ [ }"));
    }

    @Test
    public void shouldReturnFalseForUnBalancedBrackets() {
        assertFalse(validator.validate("{ [(] ) }"));
    }

    @Test
    public void shouldReturnTrueForBalancedBracketsWithCharacters() {
        assertTrue(validator.validate("(() => { " +
                "const greetings = [\"hello world\"];" +
                "console.log(greetings[0]);" +
                "})()"));
    }

}