package org.kata.meron;

/**
 * The Comparable interface defines a class's natural sorting order by allowing objects to be compared based on a custom comparison logic in the compareTo method.
 * It is implemented by classes like String, Integer, and enums, allowing them to define ordering for consistent comparisons.
 */
public class PlayingCard implements Comparable<PlayingCard> {

    /**
     * The {@code Suit} enum represents the four possible suits of a playing card.
     * <p>
     * Enums in Java provide a way to group related constants together, offering type safety and a set of built-in methods to work with the values.
     * <p>
     * <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">You can learn more about enums and their methods in the official Java documentation on enums.</a>
     */
    public enum Suit {
        SPADES, HEARTS, DIAMONDS, CLUBS;
    }

    private final Suit suit;
    private final int value;
    private final String face;

    public PlayingCard(Suit suit, int value, String face) {
        this.suit = suit;
        this.value = value;
        this.face = face;
    }

    /**
     * Compares this {@code PlayingCard} with the given {@code PlayingCard} for order.
     * <p>
     * Your job is to Implement the compareTo method below. This is from this class implementing the Comparable interface.
     * <p>
     * The comparison is first made based on the Suit. If the suits are the same, the comparison
     * is made based on the value.
     * <p>
     * Cards are sorted in the order of suit (SPADE, HEART, DIAMOND, CLUB)
     * and then by their value low too high.
     * <p></p>
     * The Method should return:
     * - a negative integer if this card is less than (sorted before) the given card
     * - a zero if this card is equal to the given card
     * - a positive integer if this card is greater than (sorted after) the given card
     *
     * @param playingCard the {@code PlayingCard} to be compared
     * @return int
     */
    @Override
    public int compareTo(PlayingCard playingCard) {
        return -1;
    }

    public static void main(String[] args) {

        // CODE PLAYGROUND - DON'T FORGET THE TESTS ;)

        PlayingCard aceOfSpades = new PlayingCard(Suit.SPADES, 14, "A");
        PlayingCard aceOfHearts = new PlayingCard(Suit.HEARTS, 14, "A");

        int comparison = aceOfSpades.compareTo(aceOfHearts);

        System.out.println("Comparing " + aceOfSpades + " to " + aceOfHearts);

        if (comparison < 0) {
            System.out.println(aceOfSpades + " is less than " + aceOfHearts);
            System.out.println("    - Sorted before");
        } else if (comparison == 0) {
            System.out.println(aceOfSpades + " is equal to " + aceOfHearts);
            System.out.println("    - Same position");
        } else {
            System.out.println(aceOfSpades + " is greater than " + aceOfHearts);
            System.out.println("    - Sorted after");
        }
    }

    // GETTERS

    public Suit getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    public String getFace() {
        return face;
    }

    /**
     * Returns a string representation of this PlayingCard in the format "face of suit".
     *
     * @return a string representing the PlayingCard
     */
    @Override
    public String toString() {
        return face + " of " + suit;
    }
}
