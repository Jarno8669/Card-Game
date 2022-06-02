package Eindopdracht;

import java.util.Scanner;

public class Game {
	private static int score;
	private static Card currentCard;
	private static Card nextCard;
	private static Deck deck;

	// Game turn
	public static void gameTurn() {
		deck.getNextCard();

		currentCard = nextCard;
		nextCard = deck.getNextCard();
		System.out.println("--------------------");
		System.out.println("Choose 'higher' or 'lower'");
		System.out.println("Your current card is: " + currentCard);
		Scanner sc = new Scanner(System.in);
		String awnser = sc.nextLine();

		if (awnser.equals("higher") && nextCard.isHigherOrEqual(currentCard)) {
			correct();
		} else if (awnser.equals("lower") && !nextCard.isHigherOrEqual(currentCard)) {
			correct();
		} else {
			gameOver();
			score = 0;
			System.out.println("--------------------");
			System.out.println("Try again!");
			gameTurn();
		}
	}

	public static void correct() {
		score++;
		nextCard = deck.getNextCard();
		System.out.println("--------------------");
		System.out.println("You are right +1 score, your score is now " + score);
		gameTurn();
	}

	// Game over
	public static void gameOver() {
		System.out.println("--------------------");
		System.out.println("You lost! The card was: " + nextCard);
		System.out.println("Your final score was: " + score);
	}

	// Main
	public static void main(String[] args) {
		deck = new Deck();
		nextCard = deck.getNextCard();
		currentCard = deck.getNextCard();
		Game.gameTurn();
	}
}
