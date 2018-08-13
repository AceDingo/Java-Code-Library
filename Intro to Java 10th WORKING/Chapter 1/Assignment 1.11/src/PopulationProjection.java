// Ross A. Fuller
//Introduction to Java

// (Population projection) 
//The U.S. Census Bureau projects population based on the following assumptions:

//		■ One birth every 7 seconds
//		■ One death every 13 seconds
//		■ One new immigrant every 45 seconds

// Write a program to display the population for each of the next five years. Assume the
// current population is 312,032,486 and one year has 365 days. Hint: In Java, if two
// integers perform division, the result is an integer. The fractional part is truncated. For
// example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate result with
// the fractional part, one of the values involved in the division must be a number with a
// decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.

public class PopulationProjection {
	public static void main(String[] args) {
		
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
		
		// Output lines after variables are calculated. 
		// Try to do a loop that cycles years and prints output. 
		int i = 0;
		
		System.out.println("Current Years Population = " + currentPop);
		System.out.println("");
		
		for (i = 1; i <= 5; i++) {
			System.out.println("The population after " + i + " year will be: " + (currentPop + yrsPopulation * i));
		}	
	}
}
