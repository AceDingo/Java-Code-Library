// Ross A. Fuller
// Introduction to Java

// (Convert feet into meters) Write a program that reads a number in feet, converts it
// to meters, and displays the result. One foot is 0.305 meter. 

// Here is a sample run:
// Enter a value for feet: 16.5
// 16.5 feet is 5.0325 meters

import java.util.Scanner;

public class FeetToMeters {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// Obtain the user input to allow you to convert US derpy-Feet into global standard Meters...
		System.out.println("Please... CITIZENS, lend me your feet... ");
		double userFeet =  keyboard.nextDouble();
		
		// Convert them bad boys to Meters...
		double meterMeasure = userFeet * .0305;
		
		// Output that measurement to the console screen you jiiive turkey!
		System.out.println("Well, we took your feet and now have " + meterMeasure + " meters for you!");
	}

}
