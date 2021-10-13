
import java.util.Scanner;

public class GuessNumber
{

	public static void main (String [] args) {
		Scanner keyboard = new Scanner (System.in);
		
		boolean done = false;
		
		System.out.println();
		System.out.println("\n******* Welcome to Number Guessing Game *******");
		System.out.println("\nIn this game you (the human player) will pick a"); 
		System.out.println("number and I (the computer) will guess the number");
		System.out.println("you picked and prompt you to type Y or H or L.");
		System.out.println("Y = guess is correct, H = guess is too High,");
		System.out.println("L = guess is too low. If guess is not correct");
		System.out.println("I will guess again.");

		String ans = "";

		int low = 1;
		int high = 101;
	
		
		System.out.println("\nPick a number between " + low + " and " + (high-1) + "."); 
		
		System.out.print("\nDid you pick a number? (Y/N): ");
		ans = keyboard.nextLine();
		System.out.println("Ok, write it down somewhere.");
		
		
		
		int counter = 1;
		
		do{
			counter++;
			int guess = (low+high)/2;
			System.out.println("\nMY GUESS IS: " + guess);
			System.out.print("Is this your number? (Y/H/L): ");
			ans = keyboard.nextLine();
			
		
			if (ans.equals("H")){
				high = guess;  // how to set new high and divide by 2?
				System.out.println("\nOk, I guessed it to be TOO HIGH. I will guess again."); //+guess will only display 50
				}	
				
			else if (ans.equals("L")){
				low = guess;  // how to set new low and divide by 2?
				System.out.println("\nOk, I guessed it to be TOO LOW. I will guess again."); //+guess will only display 50
				}
				
			else {
				System.out.println("\nI guessed it correctly after " + counter + " attempts."); // how to make it count the number of attempts
				System.out.println("End of Game.");
				System.exit(0);
				}
				
		}while (!ans.equals("Y"));	
			
	}

}