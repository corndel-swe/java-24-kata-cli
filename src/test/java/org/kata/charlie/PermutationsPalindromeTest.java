package org.kata.charlie;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PermutationsPalindromeTest {

    @Test
    public void palindromeShouldReturnTrue() {
        assertTrue(PermutationsPalindrome.isPalindrome("civic"), "civic is a Palindrome should return true");
    }

    @Disabled
    @Test
    public void permutationPalindromeShouldReturnTrue() {
        assertTrue(PermutationsPalindrome.isPalindrome("ivicc"), "ivicc is a Permutation Palindrome should return true");
    }

    @Disabled
    @Test
    public void notPalindromeShouldReturnFalse() {
        assertFalse(PermutationsPalindrome.isPalindrome("civil"), "civil is not a Palindrome/Permutation Palindrome should return false");
    }

    @Disabled
    @Test
    public void notPermutationPalindromeShouldReturnFalse() {
        assertFalse(PermutationsPalindrome.isPalindrome("livci"), "livci is not a Palindrome/Permutation Palindrome should return false");
    }
}
