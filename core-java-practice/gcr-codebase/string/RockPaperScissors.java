package string;
import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games to play: ");
        int numberOfGames = sc.nextInt();
        sc.nextLine(); // Consume newline
        String[][] gameResults = new String[numberOfGames][3];
        int userWins = 0;
        int computerWins = 0;
        for (int i = 0; i < numberOfGames; i++) {
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String userChoice = sc.nextLine().toLowerCase();
            String computerChoice = getComputerChoice();
            String winner = determineWinner(userChoice, computerChoice);
            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
            if (winner.equals("User")) {
                userWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            }
        }
        String[][] stats = calculateStats(numberOfGames, userWins, computerWins);
        displayResults(gameResults, stats);
    }
    public static String getComputerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        int index = (int) (Math.random() * 3);
        return choices[index];
    }
    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "Draw";
        } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                   (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                   (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }
    public static String[][] calculateStats(int totalGames, int userWins, int computerWins) {
        String[][] stats = new String[3][2];
        stats[0][0] = "Total Games";
        stats[0][1] = Integer.toString(totalGames);
        stats[1][0] = "User Wins";
        stats[1][1] = Integer.toString(userWins);
        stats[2][0] = "Computer Wins";
        stats[2][1] = Integer.toString(computerWins);
        return stats;
    }
    public static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.printf("%-15s %-15s %-10s%n", "User Choice", "Computer Choice", "Winner");
        for (String[] result : gameResults) {
            System.out.printf("%-15s %-15s %-10s%n", result[0], result[1], result[2]);
        }
        System.out.println("\nGame Statistics:");
        for (String[] stat : stats) {
            System.out.printf("%-15s : %s%n", stat[0], stat[1]);
        }
    }
}