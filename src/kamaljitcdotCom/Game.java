package kamaljitcdotCom;
import java.util.Arrays;
import java.util.Scanner;

public class Game {
	static String guesses = " "; // holds the user's guesses, initialize to 'null'?

	static void playGame(Scanner scanner) {
		
		int strikeCounter = 0;
		
		do {
			System.out.println("Enter target location: ");
			String userGuess = scanner.next();
			char first = userGuess.charAt(0);
			char two = userGuess.charAt(1);
			
			if ((userGuess.length() <= 2 && two <= '6' && two >= '0' && first <= 'g' && first >= 'a') || (userGuess.length() <= 2 && two <= '6' && two >= '0' && first <= 'G' && first >= 'A')) {
				// if (!guesses.contains(userGuess)) { 
				if (!Arrays.asList(guesses).contains(userGuess)) { 
					strikeCounter++;
					// check for a match
					if (dotComs1.equalsIgnoreCase(userGuess)) {
						System.out.println("Hit!");

					} else
						System.out.println("missed, try again!");
				} else {
					System.out.println("You already tried this. dotComs don't move in this game(yet)");
					System.out.println("Attack aborted");
					System.out.println();
				} 
			} else {
				System.out.println("Invalid entry");
			}
			guesses = guesses.concat(userGuess); 
			//System.out.println(dotComs1.getHitCounter());
		} while (dotComs1.getHitCounter() != 9);
		
		if (dotComs1.getHitCounter() == 9) { 
			System.out.println();
			System.out.println("All dotComs disabled");
			System.out.println("DoS attack count: " + strikeCounter);
		}
		
			
	}
	
	
	public static void main(String[] args) {
		
		//dotComs1.printTheInfo();
		System.out.println("Grid is  7 x 7");
		System.out.println("Columns are labeled 0-6, Rows are a-g");
		System.out.println("Enter a location as a letter followed by digit, e.g., a0");
		System.out.println("Good luck!");
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		
		playGame(scanner);
		
		
		boolean forever = true;
		while (forever) {
			System.out.println("Play again?  Y/N :");
			String answer;
			answer = scanner.next();
			if (answer.equalsIgnoreCase("y")) {
				dotComs1.setHitCounter(0);
				guesses = " ";
				playGame(scanner);
			} else {
				forever = false;
				scanner.close();
			}
		}
	}

	
}
