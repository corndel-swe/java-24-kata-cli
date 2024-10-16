package org.kata.meron;

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

        HashMap <String, String> map = new HashMap<>();
        map.put("smile", ":)");
        map.put("grin", ":D");
        map.put("sad", ":(");
        map.put("mad", ":@");

        for (Map.Entry<String, String> entry : map.entrySet()) {
             sentence = sentence.replace(entry.getKey(), entry.getValue());
        }
        return sentence;
    }

}
