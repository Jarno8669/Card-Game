
package Eindopdracht;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	int counter = 0;

	// Array cards
	private ArrayList<Card> cards = new ArrayList<Card>();

	// Constructor Deck | Maakt de kaarten en en shuffelt ze ook meteen
	public Deck() {
		for (int i = 0; i < 4; i++) {
			counter++;
			String suit = null;
			switch (counter) {
			case 1:
				suit = "Club";
				break;
			case 2:
				suit = "Diamonds";
				break;
			case 3:
				suit = "Spade";
				break;
			case 4:
				suit = "Hearts";
				break;
			}
			for (int j = 2; j <= 10; j++) {
				Card c = new Card(suit, j + " of " + suit, j);
				cards.add(c);
			}
			Card jack = new Card(suit, "Jack " + suit + " " + 11, 11);
			Card queen = new Card(suit, "Queen " + suit + " " + 12, 12);
			Card king = new Card(suit, "King " + suit + " " + 13, 13);
			Card ace = new Card(suit, "Ace " + suit + " " + 14, 14);
			cards.add(jack);
			cards.add(queen);
			cards.add(king);
			cards.add(ace);
		}		
		Collections.shuffle(cards);
	}

	// getNextCard functie
	public Card getNextCard() {
		Card nextCard = cards.remove(0);
		return nextCard;
	}

}
