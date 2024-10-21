package org.kata.michael;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlayingCardTest {

    @Test
    public void spadesSmallerThanAllSuitsShouldReturnNegative() {
        List<PlayingCard> cards = List.of(new PlayingCard(PlayingCard.Suit.HEARTS, 2, "2"), new PlayingCard(PlayingCard.Suit.CLUBS, 2, "2"), new PlayingCard(PlayingCard.Suit.DIAMONDS, 2, "2"));
        PlayingCard spades = new PlayingCard(PlayingCard.Suit.SPADES, 2, "2");
        for (PlayingCard card : cards) {
            assertTrue(spades.compareTo(card) < 0, "Spades should be smaller than all other suits");
        }
    }

    @Disabled
    @Test
    public void heartsLargerThanSpadesShouldReturnPositive() {
        PlayingCard spades = new PlayingCard(PlayingCard.Suit.SPADES, 2, "2");
        PlayingCard hearts = new PlayingCard(PlayingCard.Suit.HEARTS, 2, "2");
        assertTrue(hearts.compareTo(spades) > 0, "Hearts should be larger than Spades");
    }

    @Disabled
    @Test
    public void heartsSmallerThanOtherSuitsShouldReturnNegative() {
        List<PlayingCard> cards = List.of(new PlayingCard(PlayingCard.Suit.CLUBS, 2, "2"), new PlayingCard(PlayingCard.Suit.DIAMONDS, 2, "2"));
        PlayingCard hearts = new PlayingCard(PlayingCard.Suit.HEARTS, 2, "2");
        for (PlayingCard card : cards) {
            assertTrue(hearts.compareTo(card) < 0, "Hearts should be smaller than Clubs and Diamonds");
        }
    }

    @Disabled
    @Test
    public void diamondsSmallerThanClubsShouldReturnNegative() {
        PlayingCard diamonds = new PlayingCard(PlayingCard.Suit.DIAMONDS, 2, "2");
        PlayingCard clubs = new PlayingCard(PlayingCard.Suit.CLUBS, 2, "2");
        assertTrue(diamonds.compareTo(clubs) < 0, "Diamonds should be smaller than Clubs");
    }

    @Disabled
    @Test
    public void clubsLargerThanAllSuitsShouldReturnPositive() {
        List<PlayingCard> cards = List.of(new PlayingCard(PlayingCard.Suit.SPADES, 2, "2"), new PlayingCard(PlayingCard.Suit.HEARTS, 2, "2"), new PlayingCard(PlayingCard.Suit.DIAMONDS, 2, "2"));
        PlayingCard clubs = new PlayingCard(PlayingCard.Suit.CLUBS, 2, "2");
        for (PlayingCard card : cards) {
            assertTrue(clubs.compareTo(card) > 0, "Clubs should be larger than all other suits");
        }
    }

    @Disabled
    @Test
    public void sameSuitAndValueShouldReturnZero() {
        PlayingCard diamondsA = new PlayingCard(PlayingCard.Suit.DIAMONDS, 11, "J");
        PlayingCard diamondsB = new PlayingCard(PlayingCard.Suit.DIAMONDS, 11, "J");
        assertEquals(0, diamondsA.compareTo(diamondsB), "Cards with the same suit and value should be equal");
    }

    @Disabled
    @Test
    public void sortsSuitByValueIfSameSuit() {
        List<PlayingCard> deck = getOrderedCardsBySuit(PlayingCard.Suit.SPADES);
        Collections.shuffle(deck);
        Collections.sort(deck);
        for (int i = 1; i < deck.size(); i++) {
            assertTrue(deck.get(i - 1).compareTo(deck.get(i)) < 0, "Cards should be sorted by value within the same suit");
        }
    }

    @Disabled
    @Test
    public void sortsDeck() {
        List<PlayingCard> deck = getOrderedDeck();
        Collections.shuffle(deck);
        Collections.sort(deck);
        for (int i = 1; i < deck.size(); i++) {
            assertTrue(deck.get(i - 1).compareTo(deck.get(i)) < 0, "Deck should be sorted by suit and value");
        }
    }

    // HELPERS

    private static List<PlayingCard> getOrderedCardsBySuit(PlayingCard.Suit suit) {
        List<PlayingCard> deck = new ArrayList<>();
        for (int i = 2; i < 11; i++) {
            deck.add(new PlayingCard(suit, i, String.valueOf(i)));
        }
        deck.add(new PlayingCard(suit, 11, "J"));
        deck.add(new PlayingCard(suit, 12, "Q"));
        deck.add(new PlayingCard(suit, 13, "K"));
        deck.add(new PlayingCard(suit, 14, "A"));
        return deck;
    }

    private static List<PlayingCard> getOrderedDeck() {
        List<PlayingCard> deck = new ArrayList<>();
        PlayingCard.Suit[] suits = PlayingCard.Suit.values();
        for (int i = suits.length - 1; i >= 0; i--) {
            deck.addAll(getOrderedCardsBySuit(suits[i]));
        }
        return deck;
    }
}
