// Ross A. Fuller 
// Introduction to Java

// (Physics: acceleration) 
// Average acceleration is defined as the change of velocity divided by the time taken to 
// make the change, as shown in the following formula:
// 			a = v1 - v0
//   			-------
// 					t

// Write a program that prompts the user to enter the starting velocity v0 in meters/
// second, the ending velocity v1 in meters/second, and the time span t in seconds,
// and displays the average acceleration. 

// Here is a sample run:
// Enter v0, v1, and t: 5.5 50.9 4.5
// The average acceleration is 10.0889

import java.util.Scanner;

public class Acceleration {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// User input for variables, could do it in one line by spacing input of doubles apart.
		System.out.println("Please enter v0, v1, and time (in seconds) for the acceleration formula: ");
		
		// Collected Variables
		double v0 = keyboard.nextDouble();
		double v1 = keyboard.nextDouble();
		double time = keyboard.nextDouble();
		
		// Variable for the calculation of Acceleration...
		double accel = (v1 - v0) / time;
		
		// Output Lines
		System.out.println("Acceleration = " + accel);
	}
}
