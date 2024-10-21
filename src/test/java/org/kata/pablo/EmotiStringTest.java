package org.kata.pablo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmotiStringTest {

    private final EmotiString emotiString = new EmotiString();

    @Test
    public void shouldReplaceSmile() {
        assertEquals("Make me :)", emotiString.emotify("Make me smile"));
    }

    @Test
    public void shouldReplaceGrin() {
        assertEquals("Make me :D", emotiString.emotify("Make me grin"));
    }

    @Test
    public void shouldReplaceSad() {
        assertEquals("Make me :(", emotiString.emotify("Make me sad"));
    }

    @Test
    public void shouldReplaceMad() {
        assertEquals("Make me :@", emotiString.emotify("Make me mad"));
    }

    @Test
    public void shouldNotReplace() {
        assertEquals("Make me dance", emotiString.emotify("Make me dance"));
    }
}