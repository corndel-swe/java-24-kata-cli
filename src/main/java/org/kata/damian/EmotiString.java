package org.kata.damian;

import java.util.Arrays;
import java.util.stream.Collectors;

public class EmotiString {

    /**
     * Returns a string with specific words replaced by emoticons.
     * Given a sentence as a string, replace the words "smile," "grin," "sad," and "mad" with their corresponding emoticons:
     *  - "smile" -> ":)"
     *  - "grin" -> ":D"
     *  - "sad" -> ":("
     *  - "mad" -> ":@"
     *
     * @param sentence the input string to update
     * @return {@code String} a string with the specified words replaced by emoticons
     */


    public String emotify(String sentence) {
        // Define a map of words to emoticons. Using stream with a switch case.
        return Arrays.stream(sentence.split(" "))
                .map(word -> {
                    switch (word) {
                        case "smile": return ":)";
                        case "grin": return ":D";
                        case "sad": return ":(";
                        case "mad": return ":@";
                        default: return word;
                    }
                })
                .collect(Collectors.joining(" "));
    }

}
