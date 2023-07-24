# diceRoll-Project
The "diceRoll" Java program is a console-based game. Players roll a virtual six-sided dice to earn points. Rolling a 6 ends the game, 4 earns no points, others add one point. Aim for at least 3 points to win. Simple rules, console interaction, and luck-based challenge make it engaging.

Here's a brief description of how the program works:

1. The program starts by displaying a welcome message and waits for the user to input anything to start the game.

2. After the user's input, the program explains the rules of the game. The player's objective is to collect at least 3 points to win.

3. The game loop begins, where the player repeatedly rolls a virtual six-sided dice until they roll a 6, which will end the game.

4. For each dice roll, the program generates a random number between 1 and 6 (inclusive) using the rollDice() method.

5. If the roll results in a 6, the game ends, and a message is displayed saying "End of game."

6. If the roll results in a 4, the player earns no points for that roll, and a message says "Zero Points. keep rolling."

7. If the roll results in any other number (1, 2, 3, or 5), the player earns one point, and a message says "One point. keep rolling."

8. The player continues to roll the dice until they get a 6 to end the game.

9. After the game loop ends, the program checks the player's score to determine if they won or lost. If the player has collected at least 3 points, a message "YOU WIN" is displayed. Otherwise, the message "YOU LOSE!" is displayed.

10. The program then closes the Scanner object and terminates.

Note: The code uses the Scanner class to read user input from the console and the Math.random() method to generate random numbers for simulating dice rolls. The rollDice() method handles the random number generation for the dice rolls.
