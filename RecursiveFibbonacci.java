/*
 * File Name: 	RecursiveFibbonacci.java
 * Name: 		Eric Richter
 * Course:		CEN 4802C
 * Date:		01/20/2023
 */
package cop4802c;

/**
 * This class will print out the term of the Fibbonacci sequence appropriate for the input in the
 * main method. It will output to console in the following manner:
 * "The nth term of the Fibbonacci sequence is #."
 * where "n" refers to the number input in main and "#" is the calculation output.
 */
public class RecursiveFibbonacci {

	// Main method
	public static void main(String[] args) {
		// Output to user
		System.out.printf("The %dth term of the Fibbonacci sequence is %d.", 10, calcNum(10));
	}
	
	/*
	 * Given the parameter, this method calculate that term in the Fibbonacci sequence recursively.
	 */
	public static int calcNum(int i) {
		// Check for 0 or 1
		if (i <= 1) {
			return i;
		}
		
		// Calculate and return result
		return calcNum(i - 1) + calcNum(i - 2);
	}
}
