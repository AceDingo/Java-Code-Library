// Ross A. Fuller 
// Introduction to Java 

// (Financial application: calculate tips) 
// Write a program that reads the subtotal and the gratuity rate, then computes the 
// gratuity and total. For example, if the user enters 10 for subtotal and 15% for 
// gratuity rate, the program displays $1.5 as gratuity and $11.5 as total. 

// Here is a sample run:
// Enter the subtotal and a gratuity rate: 10 15
// The gratuity is $1.5 and total is $11.5

import java.util.Scanner;

public class CalculateTips {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// Prompt the lazy customer to enter their meal price and gratuity percentage. 
		System.out.println("Could you enter the price of your meal below: ");
		double userMeal = keyboard.nextDouble();
		System.out.println("Enter you Gratuity-Percentage: ");
		double userGrat = keyboard.nextDouble();
		
		// Calculate that tip with what yo mamma gave ya...
		double userTip = userMeal * (userGrat / 100);
		double userTotal = userMeal + userTip;
		
		// Output lines, total with tip and tip separately...
		System.out.println("The total cost of your Grazing-Platter is: $" + userTotal + ".");
		System.out.println("The tip at " + userGrat + "%, will be $" + userTip + ".");
	}
}
