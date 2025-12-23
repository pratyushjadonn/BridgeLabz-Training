package string;
import java.util.Scanner;
public class DeckOfCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numOfCards = suits.length * ranks.length;
        String[] deck = initializeDeck(suits, ranks, numOfCards);
        String[] shuffledDeck = shuffleDeck(deck, numOfCards);
        int n = 52; // Number of cards 
        int x = 4;  // Number of players
        String[][] players = distributeCards(shuffledDeck, n, x);
        displayPlayersCards(players);
    }
    public static String[] initializeDeck(String[] suits, String[] ranks, int numOfCards) {
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }
    public static String[] shuffleDeck(String[] deck, int n) {
        String[] shuffledDeck = deck.clone();
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            String temp = shuffledDeck[i];
            shuffledDeck[i] = shuffledDeck[randomCardNumber];
            shuffledDeck[randomCardNumber] = temp;
        }
        return shuffledDeck;
    }
    public static String[][] distributeCards(String[] deck, int n, int x) {
        if (n % x != 0) {
            System.out.println("Cannot distribute " + n + " cards to " + x + " players evenly.");
            return new String[0][0];
        }
        String[][] players = new String[x][n / x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < n / x; j++) {
                players[i][j] = deck[i * (n / x) + j];
            }
        }
        return players;
    }
    public static void displayPlayersCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (String card : players[i]) {
                System.out.println(card);
            }
            System.out.println();
        }
    }
}