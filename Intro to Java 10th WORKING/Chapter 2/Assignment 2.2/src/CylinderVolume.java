// Ross A. Fuller
// Introduction to Java

// (Compute the volume of a cylinder) 
// Write a program that reads in the radius and length of a cylinder and computes 
// the area and volume using the following formulas:
// 		area = radius * radius * pi
// 		volume = area * length

// Here is a sample run:
// Enter the radius and length of a cylinder: 5.5 12
// 		The area is 95.0331
// 		The volume is 1140.4

import java.util.Scanner;

public class CylinderVolume {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// prompt the user to enter the specifics of their "Cylinder"... heh lmao.
		System.out.println("So, I am going to need to know the length of your ... hem, cylinder: ");
		double userLength =  keyboard.nextDouble();
		System.out.println("Oh, thats it... ok, well what would be the radius... of that um, cylinder: ");
		double userRadius = keyboard.nextDouble();
		
		// Use the input to calculate the gir... I mean volume of said "cylinder"...
		double area = userRadius * userRadius * Math.PI;
		double volume = area * userLength; 
		
		// Output that data bromethius!
		System.out.println("HAHAHAHAHAHA, " + volume + " thats the volume of it?!");
	}
}
