// Ross A. Fuller
// Introduction to Java

// (Convert Celsius to Fahrenheit) 
// Write a program that reads a Celsius degree in a double value from the console, 
// then converts it to Fahrenheit and displays the result.
// The formula for the conversion is as follows:

// fahrenheit = (9 / 5) * celsius + 32
// Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.

// Here is a sample run:
// Enter a degree in Celsius: 43
// 43 Celsius is 109.4 Fahrenheit

import java.util.Scanner;

public class CelciusToFarenheit {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// Prompt the user to enter the temperature in Celcius. 
		System.out.println("Please enter the current temperature in Celcius: ");
		double userTempCel = keyboard.nextDouble();
		
		// Use that input to calculate U.S. Derp-Scale worthy Farenheit. 
		double farenheit = (9.0/5) * userTempCel + 32;
		
		// Deliver that sleek sexy output to the user.  
		System.out.println("That there ol' Celcius temp would be " + farenheit + " degrees in derpy US-Temp.");
	}
}