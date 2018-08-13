// Ross A. Fuller 
// Introduction to Java

// (Area and perimeter of a circle) Write a program that displays the area and perimeter
// of a circle that has a radius of 5.5 using the following formula:
// 				perimeter = 2 * radius * pi
// 				area = radius * radius * pi

// I will be having a user input the radius of the circle to be reported. 

import java.util.Scanner;


public class CircleAreaPerimeter {
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
	// need to first input a portion to retrieve the radius information from the user. 
	System.out.println("Please enter the RADIUS of the circle for which you would like the specifics: ");
	double userRadius = keyboard.nextDouble();
	
	// Calculate the Perimeter and Area and assigne them to a variable.  
	double userPerimeter = 2 * userRadius * Math.PI;
	double userArea = userRadius * userRadius * Math.PI;
	
	// Output lines to send the perimeter and area results to the consol. 
	System.out.println("With a RADIUS of: " + userRadius);
	System.out.println("The PERIMETER will be: " + userPerimeter);
	System.out.println("The AREA will be: " + userArea);
	}

}
