// Ross A. Fuller
// Introduction to Java

// (Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and 30
// seconds. Write a program that displays the average speed in miles per hour. 
// (Note that 1 mile is 1.6 kilometers.)

// Once again I will be using user input variables to get goin...

import java.util.Scanner;

public class AvgSpeedMiles {
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// We will need to prompt the user to enter distance traveled in Kilometers
		// and the time it took in Minutes and Seconds.
		System.out.println("How far did you travel in Kilometers?");
		double userDistKM = keyboard.nextDouble();
		System.out.println("How long did it take you in Minutes.Seconds?");
		double userTimeMS = keyboard.nextDouble();
		
		// need to calculate this all over to speed in Miles/Hr...
		double userMPH = userDistKM / userTimeMS / 1.6;
		
		// system Output to return results. 
		System.out.println("The Miles per Hour in terms of your input is: " + userMPH);
		
	}
}
