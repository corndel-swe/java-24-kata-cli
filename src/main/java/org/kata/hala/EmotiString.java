package org.kata.hala;

import java.util.HashMap;
import java.util.Map;

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
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        HashMap<String, String> emoticons = new HashMap<>(Map.of(
                "smile", ":)",
                "grin", ":D",
                "sad",":(",
                "mad","@"
        ));
    for (String word : words){
        result.append(emoticons.getOrDefault(word, word));
        result.append(" ");
    }


        return result.toString().trim();
    }


}
