// Ross A. Fuller 
// Introduction to Java

// (Current time) 
// Listing 2.7, ShowCurrentTime.java, gives a program that displays the current time 
// in GMT. Revise the program so that it prompts the user to enter the time zone offset 
// to GMT and displays the time in the specified time zone. 

// Here is a sample run:
// Enter the time zone offset to GMT: −5
// The current time is 4:50:34

import java.util.Scanner;

public class CurrentTime {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// Prompt lines yo!...
		System.out.println("Sir, what offset would you like from standard GMT? ");
		int offset = keyboard.nextInt();
		
		// Variables used calculate current time. 
		long ttlMiliSec = System.currentTimeMillis(); //Total Milliseconds 
		
	}

}
