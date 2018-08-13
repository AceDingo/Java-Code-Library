// Ross A. Fuller 
// Introduction to Java

// (Population projection) 
// Rewrite Programming Exercise 1.11 to prompt the user to enter the number of years and 
// displays the population after the number of years. Use the hint in Programming Exercise 1.11 
// for this program. The population should be cast into an integer. 

// Here is a sample run of the program:
// Enter the number of years: 5
// The population in 5 years is 325932970

import java.util.Scanner;

public class PopulationProjection {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// Global Variables
		int birth = 7;//Seconds
		int death = 13;//Seconds
		int immigrant = 45;//Seconds
		int currentPop = 312032486;//People
		int year = 365;//Days
		// 60sec, 60min, 24hrs
		int yrBirths = (((60*60*24*year)/birth));
		int yrDeaths = (((60*60*24*year)/death));
		int yrImmigrants = (((60*60*24)/immigrant));
		int yrsPopulation = (yrBirths + yrImmigrants - yrDeaths);
		
		// Prompt user to enter number of years in the future they would like to know 
		// population size.
		System.out.println("How many years from now would you like to know the Population: ");
		double userYears = keyboard.nextDouble();
		
		// Calculate Population in output lines		
		System.out.println("Current Years Population = " + currentPop);
		System.out.println("");
		
		int i = 0;
		for (i = 0; i <= userYears; i++) {
			System.out.println("The population after " + i + " year will be: " + (currentPop + yrsPopulation * i));
		}
	}
}
