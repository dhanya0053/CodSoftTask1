package practice1;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		System.out.println("Welcome to the Number Game!");
		boolean playAgain = true;
		int score = 0;
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		while (playAgain) {
			int attempts = 0;
			int num = random.nextInt(100) + 1;

			System.out.println("\nNew round! Try to guess the number between 1 and 100.");

			while (true) {
				System.out.print("Enter your guess: ");
				int userGuess = scanner.nextInt();
				attempts++;
				if (userGuess == num) {
					System.out.println(
							"Congratulations! You guessed the number " + num + " in " + attempts + " attempts.");
					score++;
					break;
				}
				if (attempts == 10) {
					System.out.println(
							"you've reached the maximum number of attempts. The correct number was " + num + ".");
					break;
				} else if (userGuess < num) {
					System.out.println("Too low! Try again.");
				} else {
					System.out.println("Too high! Try again.");
				}
			}
			System.out.print("Do you want to play again? (yes/no): ");
			String playAgain1 = scanner.next().toLowerCase();
			playAgain = playAgain1.equals("yes");
		}
		System.out.println("\nGame over! Your score is " + score + ".");
	}
}
