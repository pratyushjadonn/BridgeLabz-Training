package scenario.based;

import java.util.Random;

public class SnakeAndLadder {
	public static void main(String[] args) {
		//Use Case 1 : Game starts with a single player at position 1
		int playerPosition=0;
		System.out.println("---Welcome to Snake & Ladder Simulator---");
		System.out.println("Game starts with a single player at position "+playerPosition);
		//Use Case 2 : Player rolls the dice to get a number between 1 to 6.
		Random random=new Random();
		int dice=random.nextInt(6)+1;
		System.out.println("Dice rolled : "+dice);
		//Use case 3 : Player checks for the options between no play , ladder or snake bite
		int option=random.nextInt(3);
		if(option==0) {
			System.out.println("Option : No play");
		}
		else if(option==1) {
			System.out.println("Option : Ladder ");
			playerPosition+=dice;
		}
		else {
			System.out.println("Option:Snake");
			playerPosition-=dice;
		}
		System.out.println("New Position : "+playerPosition);
	}
}
