package org.kata.john;

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
        HashMap<String, String> wordToEmoji = new HashMap<>();
        wordToEmoji.put("smile", ":)");
        wordToEmoji.put("grin", ":D");
        wordToEmoji.put("sad", ":(");
        wordToEmoji.put("mad", ":@");

        for(Map.Entry<String, String> entry : wordToEmoji.entrySet()){
            sentence = sentence.replaceAll(entry.getKey(), entry.getValue());
        }

        return sentence;
    }
}
