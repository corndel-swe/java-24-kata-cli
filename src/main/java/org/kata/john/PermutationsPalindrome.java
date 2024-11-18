package org.kata.john;

import java.util.HashSet;
import java.util.Set;

/**
 * Challenge - Permutations Palindrome
 * <p>
 * Write an efficient function that checks whether any permutation of an input string is a palindrome.
 * You can assume the input string only contains lowercase letters.
 * <p>
 * Examples:
 * <pre>
 *   "civic" should return true
 *   "ivicc" should return true
 *   "civil" should return false
 *   "livci" should return false
 * </pre>
 * <p>
 * Note:
 * Although 'ivicc' isn't a palindrome, a permutation of it ('civic') is.
 * Ensure you fully understand the question before starting.
 * Jumping in with a flawed understanding of the problem doesn’t look good in an interview.
 */
public class PermutationsPalindrome {

    public static boolean isPalindrome(String word) {
        Set<String> stringSet = new HashSet<>();
        for (String c: word.split("")) {
            stringSet.add(c);
        }
        if(word.length() % 2 == 0){
            return stringSet.size() == word.length()/2;
        } else {
            return stringSet.size() == (word.length()/2 + 1);
        }
    }
    // loop through chars
    // check if there is a matching char
    // odd - allow 1 unmatched / even - all matched


    // even - set, chcek if size is n/2
    // odd - set, check ceil n/2
}
