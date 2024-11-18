package org.kata.michael;

import java.util.Stack;

public class BracketValidator {

  /**
   * Validates the proper nesting of braces, brackets, and parentheses in the given input string.
   * <p>
   * Returns a boolean to determine whether all openers '(', '{', '[' and their corresponding
   * closers ')', '}', ']' in the input string are properly nested and balanced.
   * <p>
   * The input string can contain any characters, but only the brackets are considered for validation.
   *
   * @param input the string to validate for proper nesting of brackets
   * @return {@code true} if the input string's openers and closers are properly nested;
   * {@code false} otherwise
   */
  public boolean validate(String input) {
    // create a stack to track opening brackets
    Stack<String> openingBracketStack = new Stack<>();

    // convert input into array of string characters
    String[] strArr = input.split("");

    // loop over characters and identify brackets in switch statement
    for (String c : strArr) {
      switch (c) {
        case "(" -> openingBracketStack.push("(");
        case "{" -> openingBracketStack.push("{");
        case "[" -> openingBracketStack.push("[");
        // closing brackets can only close previous open bracket if they're the same type
        case ")" -> {
          if (openingBracketStack.peek().equals("(")) {
            openingBracketStack.pop();
          } else {
            return false;
          }
        }
        case "}" -> {
          if (openingBracketStack.peek().equals("{")) {
            openingBracketStack.pop();
          } else {
            return false;
          }
        }
        case "]" -> {
          if (openingBracketStack.peek().equals("[")) {
            openingBracketStack.pop();
          } else {
            return false;
          }
        }
      }
    }

    return openingBracketStack.isEmpty();
  }
}
