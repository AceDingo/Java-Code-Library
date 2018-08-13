// Ross A. Fuller 
// Introduction to Java

// (Physics: finding runway length) 
// Given an airplane’s acceleration a and take-off
// speed v, you can compute the minimum runway length needed for an airplane to
// take off using the following formula:
// 			length = v^2
// 					----
//					 2a

//Write a program that prompts the user to enter v in meters/second (m/s) and the
//acceleration a in meters/second squared (m/s2), and displays the minimum runway
//length. 

// Here is a sample run:
// Enter speed and acceleration: 60 3.5
// The minimum runway length for this airplane is 514.286

import java.util.Scanner;

public class FindRunwayLength {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// Prompt user to enter speed & acceleration.
		System.out.println("Please enter Speed and Acceleration: ");
		double userSpeed = keyboard.nextDouble();
		double userAccel = keyboard.nextDouble();
		
		// Calculate minimum runway length
		double length = Math.pow(userSpeed, 2) / 2 *(userAccel);
		
		// Output lines
		System.out.println("The minimum length of the runway would be: " + length);
	}

}
