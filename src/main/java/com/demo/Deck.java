package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards = new ArrayList<>();
    private List<Card> discardPile = new ArrayList<>();

    public Deck() {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        for(String suit : suits) {
            for(String value : values) {
                cards.add(new Card(suit, value));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        if (!cards.isEmpty()) {
            return cards.remove(0);
        }
        return null;
    }

    public void discardCard(Card card) {
        discardPile.add(card);
    }

    public void printDeck() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public int remainingCards() {
        return cards.size();
    }

    public int discardedCards() {
        return discardPile.size();
    }
}
