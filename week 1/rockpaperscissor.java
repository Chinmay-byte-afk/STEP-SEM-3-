import java.util.Random;
import java.util.Scanner;

public class rockpaperscissor {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Create Random object for computer's random choice
        Random r = new Random();

        // Store the names of the moves
        // Index 0 = Rock, 1 = Paper, 2 = Scissors
        String[] move = {"Rock", "Paper", "Scissors"};

        // Array to store the result of each round
        String[] result = new String[5];

        // Array to store the player's choices
        int[] player = new int[5];

        // Array to store the computer's choices
        int[] computer = new int[5];
        int playerWins = 0;// Variable to count the number of rounds won by the player
        // Loop to play the game 5 times
        for (int i = 0; i < 5; i++) {

            // Display the current round number
            System.out.println("\nRound " + (i + 1));

            // Ask the user to enter their move
            System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissors:");

            // Store the player's input
            player[i] = sc.nextInt();

            // Generate a random number between 0 and 2
            computer[i] = r.nextInt(3);

            // Check if both player and computer selected the same move
            if (player[i] == computer[i]) {

                // Match is a tie
                result[i] = "Tie";

            }

            // Check all winning conditions for the player
            else if ((player[i] == 0 && computer[i] == 2) ||   // Rock beats Scissors
                     (player[i] == 1 && computer[i] == 0) ||   // Paper beats Rock
                     (player[i] == 2 && computer[i] == 1)) {   // Scissors beats Paper

                // Player wins
                result[i] = "Player Wins";
                playerWins++; // Increment the player's win count

            }

            // If none of the above conditions are true
            else {

                // Computer wins
                result[i] = "Computer Wins";

            }
        }

        // Print the summary table heading
        System.out.println("\n-----------------------------------------------");
        System.out.println("Round\tPlayer\tComputer\tResult");
        System.out.println("-----------------------------------------------");

        // Calculate win rate
        double winRate = (playerWins / 5.0) * 100;

        // Display total wins and win rate
        System.out.println("\nPlayer Wins : " + playerWins);
        System.out.println("Win Rate : " + winRate + "%");

        // Print the details of all 5 rounds
        for (int i = 0; i < 5; i++) {

            System.out.println((i + 1) + "\t" +
                    move[player[i]] + "\t" +
                    move[computer[i]] + "\t\t" +
                    result[i]);
        }

        // Close the Scanner object
        sc.close();
    }
}