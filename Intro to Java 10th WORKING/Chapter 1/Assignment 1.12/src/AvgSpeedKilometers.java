// Ross A. Fuller
// Introduction to Java

// (Average speed in kilometers) 
// Assume a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds. 

// Write a program that displays the average speed in kilometers per
// hour. (Note that 1 mile is 1.6 kilometers.)

import java.util.Scanner;

public class AvgSpeedKilometers {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// Prompt user to enter necessary input.
		System.out.println("Sir, meow do you know have far you were traveling in Miles: ");
		double userDistMiles = keyboard.nextDouble();
		System.out.println("Meow, how long did it take you to travel that distance (Minutes.Seconds): ");
		double userTimeMS = keyboard.nextDouble();
		
		// Need to calculate the conversion to KMPH.
		double userKMPH = userDistMiles * userTimeMS * 1.6;
		
		// Output Lines
		System.out.println("JESUS CHRIST, you were going: " + userKMPH + "KMPH");
		System.out.println("Meow, I am going to have to ticket you for that.");
		
		
	}

}
