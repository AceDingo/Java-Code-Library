// Ross A. Fuller 
// Introduction to Java

//(Print a table) Write a program that displays the following table:
// a    a^2    a^3
// ===============
// 1      1      1
// 2      4      8
// 3      9     27
// 4     16     64

//NEED TO LEARN PADDING SPACING TO MAKE ROWS LINE UP RIGHT!!!!!!!!!!!!!!!!!!!!!!!!!
public class SquaringTable {
	public static void main (String[] args) {
		double a =0;
		
		// Header Lines
		System.out.println("a    a^2    a^3");
		System.out.println("===============");
		
		// Table Fill
		for (a = 0; a <= 5; a++) {
			System.out.println(a + "  " + Math.pow(a,2) + "    " + Math.pow(a, 3));
		}
	}
}
