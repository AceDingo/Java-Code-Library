// Ross A. Fuller
// Introduction to Java

// (Find the number of years) 
// Write a program that prompts the user to enter the minutes (e.g., 1 billion), 
// and displays the number of years and days for the minutes. For simplicity, assume 
// a year has 365 days. 

// Here is a sample run:
// Enter the number of minutes: 1,000,000,000
// 1,000,000,000 minutes is approximately 1902 years and 214 days

import java.util.Scanner;

public class NumberOfYears {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// Prompt the user...
		System.out.println("Please let us know the number of minutes you would like converted: ");
		int userMin = keyboard.nextInt();
		
		// Breakdown of minutes into days, weeks, years.  
		int hours = userMin / 60;
		int days = hours / 24; 
		int years = days / 365;
		int leftOverWeeks = (days % 365) / 7;
		int leftOverDays = days % 365 % 7;
				
		// Report your output... use modulus for remainders...
		System.out.println("Number of Years: " + years);
		System.out.println("Number of Weeks: " + leftOverWeeks);
		System.out.println("Number of days:  " + leftOverDays);
		System.out.println("BOOM GOT IT, HELL YA!");
	}
}
