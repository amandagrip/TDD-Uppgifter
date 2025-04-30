package com.demo;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println("Deck created with " + deck.remainingCards() + " cards");

        deck.shuffle();
        System.out.println("Deck shuffled");

        Card drawn = deck.drawCard();
        System.out.println("You drew " + drawn);
        System.out.println("Remaining cards: " + deck.remainingCards());

        deck.discardCard(drawn);
        System.out.println("Discarded cards: " + deck.discardedCards());
    }
}
