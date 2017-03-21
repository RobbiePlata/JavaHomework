//Robert C Plata III
import java.util.Scanner; // importing scanner util

public class InitiateHangman {
	
	//main 
	public static void main(String[] args) {
		
		
		Scanner kb = new Scanner(System.in);
		Hangman game = new Hangman(); // New hangman game from hangman class
		
		while(!game.isFound()){ // While is found is false
			System.out.println("Take a guess:");
			System.out.println("Correct Guesses: " + game.getGuessCount()[0]); // 0 is correct
			System.out.println("Incorrect Guesses: " + game.getGuessCount()[1]); // 1 is incorrect
			char guess = kb.next().charAt(0); // only taking location 0 from the console input
			game.makeGuess(guess); //makeGuess Method active
			System.out.println(); 
		}
		
	}
}