package scenario.based;
import java.util.*;
public class SnakeAndLadder {
	public static void main(String[] args) {
		//Use Case 1 : Game starts with a single player at position 1
		int playerPosition=0;
		System.out.println("------Welcome to Snake & Ladder Simulator------");
		System.out.println("Game starts with a single player at position "+playerPosition);
		System.out.println("-------------------------------------------");
		//Use Case 2 : Player rolls the dice to get a number between 1 to 6.
		Random random=new Random();
		int finalPosition=100;
		//Use case 4 : Repeat till the player reaches the winning position 100
		while(playerPosition<finalPosition) { 
			int dice=random.nextInt(6)+1;  //dice roll
			System.out.println("Dice rolled : "+dice);
			//Use case 3 : Player checks for the options between no play , ladder or snake bite
			int option=random.nextInt(3);  //0-No play 1-Ladder 2-Snake
			if(option==0) {
				System.out.println("Option : No play");
			}
			else if(option==1) {
				System.out.println("Option : Ladder ");
				playerPosition+=dice;
				//Use Case 5 :Player gets the exact winning position
				if(playerPosition>finalPosition) {
					playerPosition-=dice;
				}
			}
			else {
				System.out.println("Option:Snake");
				playerPosition-=dice;
				if(playerPosition<0) {
					playerPosition=0;
				}
			}
			System.out.println("New Position : "+playerPosition);
			System.out.println("-------------------------------------------");
		}

	}
}