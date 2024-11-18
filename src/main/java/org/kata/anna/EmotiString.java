package org.kata.anna;

import java.util.Arrays;

public class EmotiString {
    static String newSentence = null;
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
    public static String emotify(String sentence)
    {
        while (true) {
            if (sentence.contains("smile".toLowerCase())) {
                sentence = sentence.replace("smile", ":)");
            } else if (sentence.contains("grin".toLowerCase())) {
                sentence = sentence.replace("grin", ":D");
            } else if (sentence.contains("sad".toLowerCase())) {
                sentence = sentence.replace("sad", ":(");
            } else if (sentence.contains("mad".toLowerCase())) {
                sentence = sentence.replace("mad", ":@");
            }
            else {
                break;
            }
        }

        return sentence;
    }

//    public static void main(String[] args) {
//        System.out.println(EmotiString.emotify("I am smile boom sad nds"));
//    }
//
}
