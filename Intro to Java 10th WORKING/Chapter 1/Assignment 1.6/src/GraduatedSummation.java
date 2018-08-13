// Ross A. Fuller
// Introduction to Java

// (Summation of a series) Write a program that displays the result of:
//                                   1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9.
import java.util.Scanner;

public class GraduatedSummation {
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter dat dere dang-ol number what you wanna be summ'atin up to...");
		
		int userNum = keyboard.nextInt();
		int sum = 0;
		int i = 0;
		
		for (i = 1; i <= userNum; i++) {
			sum = sum + i;
		}
		System.out.println("Dat dere total be right around... " + sum);
	}

}
