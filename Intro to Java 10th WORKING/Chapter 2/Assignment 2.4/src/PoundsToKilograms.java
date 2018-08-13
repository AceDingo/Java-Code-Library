// Ross A. Fuller 
// Introduction to Java

// (Convert pounds into Kilograms) 
// Write a program that converts pounds into kilograms.
// The program prompts the user to enter a number in pounds, converts it
// to kilograms, and displays the result. One pound is 0.454 kilograms. Here is a

// Sample Run:
// Enter a number in pounds: 55.5
// 55.5 pounds is 25.197 kilograms

import java.util.Scanner;

public class PoundsToKilograms {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// Here we will need to coax a poundage out of these heffers. 
		System.out.println("Yo Fat-Mike! I need some 'o' that poundage for a Kilogram Conversion...");
		double userPoundage = keyboard.nextDouble();
		
		// Calculate that poundage out into some kill-o-gram... age...
		double kilograms = userPoundage * 0.454;
		
		// Output that scientifically sexy kill-o-gram-age...
		System.out.println("AYE FAT MIKE, you " + kilograms + "kg, Bruh!");
		
	}

}
