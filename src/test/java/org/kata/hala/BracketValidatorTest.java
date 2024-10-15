package org.kata.hala;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketValidatorTest {

    private final BracketValidator validator = new BracketValidator();

    @Test
    public void shouldReturnTrueForBalancedBrackets() {
        assertTrue(validator.validate("{ [] ( ) }"));
    }

    @Disabled
    @Test
    public void shouldReturnFalseForMissingCloser() {
        assertFalse(validator.validate("{ [ }"));
    }

    @Disabled
    @Test
    public void shouldReturnFalseForUnBalancedBrackets() {
        assertFalse(validator.validate("{ [(] ) }"));
    }

    @Disabled
    @Test
    public void shouldReturnTrueForBalancedBracketsWithCharacters() {
        assertTrue(validator.validate("(() => { " +
                "const greetings = [\"hello world\"];" +
                "console.log(greetings[0]);" +
                "})()"));
    }

}