package Eindopdracht;

public class Card {
	private String suit;
	private String name;
	public int value;

	public Card(String suit, String name, int value) {
		this.name = name;
		this.suit = suit;
		this.value = value;
	}

	public String toString() {
		return name;
	}

	public boolean isHigherOrEqual(Card c) {
		if (this.value == c.value) {
			System.out.println("--------------------");
			System.out.println("It was equal");

			return true;

		} else if (this.value > c.value) {
			return true;
		} else {
			return false;
		}
	}
}