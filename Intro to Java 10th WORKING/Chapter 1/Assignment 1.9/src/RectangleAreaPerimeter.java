// Ross A. Fuller 
// Introduction to Java 

//(Area and perimeter of a rectangle) Write a program that displays the area and
//perimeter of a rectangle with the width of 4.5 and height of 7.9 using the following
//formula: area = width * height

import java.util.Scanner;

public class RectangleAreaPerimeter {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// Prompt the user to enter height and length data...
		System.out.println("Please enter the Height of your rectangle: ");
		double userHeight = keyboard.nextDouble();
		System.out.println("Please enter the Length of your rectangle: ");
		double userLength = keyboard.nextDouble();
		
		// set up variables to calculate AREA and PERIMETER...
		double recArea = userHeight * userLength;
		double recPerimeter = (2 * userHeight) + (2 * userLength);
		
		// Output lines to relay information for user's rectangle. 
		System.out.println("With a Height of " + userHeight + " and a Length of " + userLength + ".");
		System.out.println("The AREA of the user's rectangle will be: " + recArea);
		System.out.println("The PERIMETER of the user's rectangle will be: " + recPerimeter);
		
	
	}
}
