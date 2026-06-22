/*
Trenten Coffman
June 21, 2026
Module 2.2 Assignment

Game of rock-paper-scissors
*/
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
	
	public static void main(String[] args) {
		// declarations
		final int ROCK = 1;
		final int PAPER = 2;
		final int SCISSORS = 3;
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int computerChoiceInt;
		int playerChoiceInt = 0;
		String computerChoiceString = "";
		String playerChoiceString = "";
		
		// get user input
		System.out.println("\nWelcome to RockPaperScissors!");
		while (playerChoiceInt != ROCK && playerChoiceInt != PAPER && playerChoiceInt != SCISSORS) {
			System.out.print("\nEnter " + ROCK + " for rock, " + PAPER + " for paper, or " + SCISSORS + " for scissors: ");
			if (input.hasNextInt()) {
				playerChoiceInt = input.nextInt();
			}
			else {
				input.next();
			}
		}
		
		computerChoiceInt = random.nextInt(3) + 1;
		
		// match int choices to corresponding string
		switch (playerChoiceInt) {
			case ROCK:
				playerChoiceString = "Rock";
				break;
			case PAPER:
				playerChoiceString = "Paper";
				break;
			case SCISSORS:
				playerChoiceString = "Scissors";
				break;
		}
		switch (computerChoiceInt) {
			case ROCK:
				computerChoiceString = "Rock";
				break;
			case PAPER:
				computerChoiceString = "Paper";
				break;
			case SCISSORS:
				computerChoiceString = "Scissors";
				break;
		}
		
		// determine winner and display game results
		System.out.print("You chose " + playerChoiceString + ". The computer chose " + computerChoiceString + ". ");
		if (playerChoiceInt == ROCK) {
			switch (computerChoiceInt) {
				case ROCK:
					System.out.println("It's a tie.");
					break;
				case PAPER:
					System.out.println("You lose.");
					break;
				case SCISSORS:
					System.out.println("You win!");
					break;
			}
		}
		else if (playerChoiceInt == PAPER) {
			switch (computerChoiceInt) {
				case ROCK:
					System.out.println("You win!");
					break;
				case PAPER:
					System.out.println("It's a tie.");
					break;
				case SCISSORS:
					System.out.println("You lose.");
					break;
			}
		}
		else if (playerChoiceInt == SCISSORS) {
			switch (computerChoiceInt) {
				case ROCK:
					System.out.println("You lose.");
					break;
				case PAPER:
					System.out.println("You win!");
					break;
				case SCISSORS:
					System.out.println("It's a tie.");
					break;
			}
		}
	}
}