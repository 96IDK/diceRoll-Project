import java.util.Scanner;

public class diceRoll {

        public static void main(String[] args) {


            // Create a Scanner object to read input from the user
            Scanner scan = new Scanner(System.in);

            // Welcome message for the user
            System.out.println(" Lets play rolling java type anything to start.\n");

            // Wait for user input before explaining the rules
            scan.nextLine();

            // Display the game rules
            System.out.println(" Great here are the rules:\n");
            System.out.println(" If you role a 6 the games stops.");
            System.out.println(" if you roll a 4 nothing happens");
            System.out.println(" Otherwise you get 1 point\n");
            System.out.println(" You must collect at least 3 point to win> enter anything to roll:");

            // Wait for user input before starting the game
            scan.nextLine();

            // Initialize the player's score to 0
            int score = 0;

            // Game loop, runs until the player rolls a 6
            while(true){

                // Wait for user input before rolling the dice
                scan.nextLine();

                // Roll the dice and get the result
                int diceRoll = rollDice();

                // Display the result of the dice roll
                System.out.println("You rolled a " +diceRoll);

                // Check if the roll is a 6 (end of the game)
                if (diceRoll ==6){
                    System.out.println(" End of game");
                    break;

                    // Check if the roll is a 4 (no points earned)
                } else if (diceRoll == 4) {
                    System.out.println("Zero Points. keep rolling");

                    // Increment the score by 1 if the roll is not 4 or 6
                }else {
                    score++;
                    System.out.println(" One point. keep rolling");
                }

            }
            // Check if the player won or lost based on the score
            if(score >= 3){
                System.out.println(" YOU WIN");
            }else {
                System.out.println(" YOU LOSE!");
            }
            // Close the Scanner object
            scan.close();
        }
        // Method to simulate rolling a six-sided dice and return the result
        public static int rollDice(){

            // Generate a random number between 1 and 6 (inclusive) to simulate a dice roll
            double randomNumber = Math.random() * 6;
            randomNumber++;
            return (int) randomNumber;


        }


}
