// Ross A. Fuller 
// Introduction to Java

// (Science: calculating energy) 

// Write a program that calculates the energy needed to heat water from an initial temperature 
// to a final temperature. Your program should prompt the user to enter the amount of water in 
// kilograms and the initial and final temperatures of the water. 

// The formula to compute the energy is Q = M * (finalTemperature – initialTemperature) * 4184
// where M is the weight of water in kilograms, temperatures are in degrees Celsius, and energy 
// Q is measured in joules. 

// Here is a sample run:
// Enter the amount of water in kilograms: 55.5
// Enter the initial temperature: 3.5
// Enter the final temperature: 10.5
// The energy needed is 1625484.0

import java.util.Scanner;

public class CalculatingEnergy {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// User input prompt 
		System.out.println("Please enter desired amount of water in kilograms: ");
		double waterWeight = keyboard.nextDouble();
		System.out.println("Please enter the starting Temperature of the water: ");
		double startTemp = keyboard.nextDouble();
		System.out.println("Please enter the ending temperature of the water: ");
		double endTemp = keyboard.nextDouble();
		
		// Calculate the energy needed to do so. 
		double energy = waterWeight * (endTemp - startTemp) * 4184;
		
		// Output Lines
		System.out.println("The energy level necessary would be about: " + energy + " ans-units.");
	}
}
