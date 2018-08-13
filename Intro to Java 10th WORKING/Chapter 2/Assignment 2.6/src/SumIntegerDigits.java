// Ross A. Fuller 
// Introduction to Java

// (Sum the digits in an integer) 
// Write a program that reads an integer between 0 and 1000 and adds all the digits in
// the integer. For example, if an integer is 932, the sum of all its digits is 14.

// Hint: Use the % operator to extract digits, and use the / operator to remove the
// extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.

// Here is a sample run:
// Enter a number between 0 and 1000: 999
// The sum of the digits is 27

import java.util.Scanner;

public class SumIntegerDigits {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// Get that sweet sweet user data from the... user...
		System.out.println("Enter them digits, between 0 and 1000.");
		int userNum = keyboard.nextInt();
		
		// IF Statement to make sure the number falls between 0 and 1000...
		if ((userNum < 0) || (userNum > 1000)) {
			System.out.println("So Sorry, no feedback for you.  Check yo number foo!");
		}
		else {
		// Strip that number down to its individual character values... use modulus...
		int one = userNum % 10;
		int two = (userNum / 10) % 10;
		int three = (userNum / 100) % 10;
		int total = (one+two+three);
		
		// That output son...
		System.out.println(total);
		
		}
	}

}
