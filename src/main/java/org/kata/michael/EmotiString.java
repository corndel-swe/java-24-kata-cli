package org.kata.michael;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmotiString {

  /**
   * Returns a string with specific words replaced by emoticons.
   * Given a sentence as a string, replace the words "smile," "grin," "sad," and "mad" with their corresponding emoticons:
   * - "smile" -> ":)"
   * - "grin" -> ":D"
   * - "sad" -> ":("
   * - "mad" -> ":@"
   *
   * @param sentence the input string to update
   * @return {@code String} a string with the specified words replaced by emoticons
   */
  public String emotify(String sentence) {
    // create a map of words with their corresponding emoticons
    HashMap<String, String> emoticonMap = new HashMap<>();
    emoticonMap.put("smile", ":)");
    emoticonMap.put("grin", ":D");
    emoticonMap.put("sad", ":(");
    emoticonMap.put("mad", ":@");

    // create regex pattern
    Pattern pattern = Pattern.compile("(" + String.join("|", emoticonMap.keySet()) + ")");

    // create matcher to perform match operations
    Matcher matcher = pattern.matcher(sentence);

    // create stringbuilder to store result
    StringBuilder sb = new StringBuilder();

    // replace words in sentence with emoticon
    while (matcher.find()) {
      // get the matched word
      String match = matcher.group();

      // use matched word to replace with corresponding emoticon from hashmap
      matcher.appendReplacement(sb, emoticonMap.get(match));
    }

    // copies remainder of the input sentence
    matcher.appendTail(sb);

    return sb.toString();
  }

}
