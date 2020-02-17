/**
   This program demonstrates how numeric types and operators behave in Java
*/
import java.util.Scanner;
public class NumericTypes {
	public static void main (String [] args) {
		final int NUMBER = 2; // number of scores
		//TASK #2 Create a Scanner object here 
		//identifier declarations
		Scanner userInput = new Scanner (System.in);
		//Task #2 declare a variable to hold the user’s temperature
		Scanner userTemp = new Scanner (System.in);
        String userInputName;
		int score1; // first test score
		int score2; // second test score
		int BOILING_IN_F; // boiling temperature
		double fToC; // temperature in Celsius
		double average; // arithmetic average
		String output; // line of output to print out
		// Find an arithmetic average
		System.out.print("Please enter your name here: ");
		userInputName = userInput.nextLine();
		//Task #2 prompt user to input score1
		//Task #2 read score1 
		System.out.print("Please enter your value for score 1 here: ");
		score1 = userInput.nextInt();
		//Task #2 prompt user to input score2
		//Task #2 read score2 
		System.out.print("Please enter your value for score 2 here: ");
		score2 = userInput.nextInt();
		average = (double)(score1 + score2) / NUMBER;
		output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output);
		System.out.print("Please enter your value for boiling temperature here: ");
		BOILING_IN_F = userInput.nextInt();
		// Convert Fahrenheit temperatures to Celsius
		fToC = (5.0/9.0) * (BOILING_IN_F - 32);
		output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		//Task #2 prompt user to input another temperature
		//Task #2 read the user’s temperature in Fahrenheit
		//Task #2 convert the user’s temperature to Celsius
		//Task #2 print the user’s temperature in Celsius
		System.out.print("Please enter your another value for boiling temperature here: ");
		BOILING_IN_F = userInput.nextInt();
		fToC = (5.0/9.0) * (BOILING_IN_F - 32);
		output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		System.out.println("Goodbye"); // to show that the program is ended	
	}
}
