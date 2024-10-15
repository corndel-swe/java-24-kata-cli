package org.kata.james;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmotiStringTest {

    private final EmotiString emotiString = new EmotiString();

    @Test
    public void shouldReplaceSmile() {
        assertEquals("Make me :)", emotiString.emotify("Make me smile"));
    }

    @Disabled
    @Test
    public void shouldReplaceGrin() {
        assertEquals("Make me :D", emotiString.emotify("Make me grin"));
    }

    @Disabled
    @Test
    public void shouldReplaceSad() {
        assertEquals("Make me :(", emotiString.emotify("Make me sad"));
    }

    @Disabled
    @Test
    public void shouldReplaceMad() {
        assertEquals("Make me :@", emotiString.emotify("Make me mad"));
    }

    @Disabled
    @Test
    public void shouldNotReplace() {
        assertEquals("Make me dance", emotiString.emotify("Make me dance"));
    }
}