// Ross A. Fuller
// Introduction to Java

//(Compute expressions) Write a program that displays the result of
//
//			(9.5 * 4.5 - 2.5 * 3)
//		----------------------------
//				(45.5 - 3.5)

public class ComputeExpression {
	public static void main(String[] args) {
		
		// Problem Stated
		System.out.println("9.5 * 4.5 - 2.5 * 3");
		System.out.println("-------------------");
		System.out.println("     45.5 - 3.5    ");
		System.out.println("");
		System.out.println("=======EQUALS======");
		System.out.println("");
		
		// Solving problem and executing output. 
		double answer = (((9.5 * 4.5) - (2.5 * 3)) / (45.5 - 3.5));
		double ansRound = Math.round(answer*100.0)/100.0;
		
		System.out.println(ansRound + " is the answer you seek ... NERD!");
	}
}
