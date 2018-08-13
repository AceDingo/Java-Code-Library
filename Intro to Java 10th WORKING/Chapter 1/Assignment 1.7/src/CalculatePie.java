// Ross A. Fuller
// Introduction to Java

// (Approximate Pi) Pi can be computed using the following formula:

//          (      1     1     1     1     1       ) 
// Pi = 4 x | 1 - --- + --- - --- + --- - --- + ...|
//          (      3     5     7     9     11      )

// Use 1.0 instead of 1 in your program.

// For the first output calculate pi up to the 1/11-th position. 
// For the second output calculate pi up to the 1/13-th position. 

// I am going to attempt to make this a little more complicated by having the individual input 
// the number of positions out from the decimal they wish to have returned.  
// (i.e. 3 positions = 3.149).

import java.util.Scanner;

public class CalculatePie {
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// User Input prompt.
		System.out.println("Input how many slices out from the dot you want with your Pi...");
		int userPos = keyboard.nextInt();
		double sum = 0;
		int i = 0;
		int denom = 3;
		
		// FOR Loop: To set p the first digit of pie, then loop through each position past it
		//           Then loop through to calculate the decimals past 3.0
		for (i = 1; i <= userPos; i++) {  
			sum = 3.0 + (Math.pow(denom,-1) * -1);
			denom+=2;
		}
		
		// Output lines. 
		System.out.println("Pi to the Nth Degree: " + sum);
	}
}
