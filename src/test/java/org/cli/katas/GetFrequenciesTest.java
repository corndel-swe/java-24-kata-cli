package org.cli.katas;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class GetFrequenciesTest {

    private final GetFrequencies getFrequencies = new GetFrequencies();

    @Test
    void testSingleInstanceSingleCharacter() {
        HashMap<Character, Integer> expected = new HashMap<>(Map.of( 'c', 1));
        assertEquals(expected, getFrequencies.getFrequencies("c"), "c should produce c - 1");
    }

    @Test
    void testMultipleInstanceSingleCharacter() {
        HashMap<Character, Integer> expected = new HashMap<>(Map.of( 'c', 3));
        assertEquals(expected, getFrequencies.getFrequencies("ccc"), "ccc should produce c - 3");
    }

    @Test
    void testMultipleInstanceMultipleCharacters() {
        HashMap<Character, Integer> expected = new HashMap<>(Map.of( 'a', 3, 'b', 2, 'c', 1));
        assertEquals(expected, getFrequencies.getFrequencies("aaabbc"),
                "aaabbc should produce a - 3, b - 2, c - 3");
    }

    @Test
    void testIgnoresWhitespace() {
        HashMap<Character, Integer> expected = new HashMap<>(Map.of( 'x', 2, 'y', 2));
        assertEquals(expected, getFrequencies.getFrequencies("xy yx"),
                "xy yx should produce x - 2, y - 2");
    }
}
