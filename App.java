/*
 * File Name:	Calculator.java
 * Names:		Eric Richter
 * Course:		COP 2800C at Valencia College
 * Professor:	David Stendel 
 * Description:	This program will print a user interface that will allow the user to pick from
 * 				multiple options based on a prompt from the interface. These options are: 
 * 				Get ? (N)umbers.						Entering N will prompt the user to enter
 * 														an amount of numbers. ? Is an amount of
 * 														numbers decided in main.
 *  			(A)dd the numbers.						Entering A will add the numbers previously
 *  													input. If no numbers were entered, the 
 *  													program will print a message advising the
 *  													user to enter numbers first.
 *  			(S)ubtract the numbers.					Entering S will subtract the numbers 
 *  													previously input. If no numbers were 
 *  													entered, the program will print a message 
 *  													advising the user to enter numbers first.
 *  			(M)ultiply the Numbers.					Entering M will multiply the numbers 
 *  													previously input. If no numbers were 
 *  													entered, the program will print a message 
 *  													advising the user to enter numbers first.
 *  			(D)ivide the numbers.					Entering D will divide the numbers 
 *  													previously input. It will not allow the
 *  													user to divide by zero. If no numbers were
 *  													entered, the program will print a message 
 *  													advising the user to enter numbers first.
 *  			A(V)erage the numbers.					Entering V will average the numbers 
 *  													previously input. If no numbers were 
 *  													entered, the program will print a message 
 *  													advising the user to enter numbers first.
 *  			Determine the (L)argest number.			Entering L will determine the largest
 *  													number of the numbers previously input. 
 *  													If no numbers were entered, the program 
 *  													will print a message advising the user to
 *  													enter numbers first.
 *  			Determine the small(E)st number.		Entering S will determine the smallest
 *  													number of the numbers previously input. 
 *  													If no numbers were entered, the program 
 *  													will print a message advising the user to
 *  													enter numbers first.
 *  			Determine the s(I)gn of each number.	Entering I will determine the sign
 *  													(positive, negative, or zero) for all
 *  													numbers of the numbers previously input. 
 *  													If no numbers were entered, the program 
 *  													will print a message advising the user to
 *  													enter numbers first.
 *  			E(X)it.									Entering X will print out a good-bye 
 *  													message.
 * Date:		10/21/21
 */
package com.MavenCalculator;

// Packages
import java.util.Scanner;
import java.lang.Character;

/**
 * This class will print a user interface that will allow the user to pick from
 * multiple options based on a prompt from the interface. These options are: Get
 * ? (N)umbers (? is the amount of numbers. amount is decided in main). 
 * Entering N will prompt the user to enter an amount of numbers.
 * (A)dd the numbers. Entering A will add the numbers previously input. If no
 * numbers were entered, the program will print a message advising the user to
 * enter numbers first. (S)ubtract the numbers. Entering S will subtract the
 * numbers previously input. If no numbers were entered, the program will print
 * a message advising the user to enter numbers first. (M)ultiply the Numbers.
 * Entering M will multiply the numbers previously input. If no numbers were
 * entered, the program will print a message advising the user to enter numbers
 * first. (D)ivide the numbers. Entering D will divide the numbers previously
 * input. It will not allow the user to divide by zero. If no numbers were
 * entered, the program will print a message advising the user to enter numbers
 * first. A(V)erage the numbers. Entering V will average the numbers previously
 * input. If no numbers were entered, the program will print a message advising
 * the user to enter numbers first. Determine the (L)argest number. Entering L
 * will determine the largest number of the numbers previously input. If no
 * numbers were entered, the program will print a message advising the user to
 * enter numbers first. Determine the small(E)st number. Entering S will
 * determine the smallest number of the numbers previously input. If no numbers
 * were entered, the program will print a message advising the user to enter
 * numbers first. Determine the s(I)gn of each number. Entering I will determine
 * the sign (positive, negative, or zero) for all numbers of the numbers
 * previously input. If no numbers were entered, the program will print a
 * message advising the user to enter numbers first. E(X)it. Entering X will
 * print out a good-bye message.
 * 
 * @author Eric Richter
 * @version 1.1, 10/21/21
 */
public class App {
	/**
	 * This method will print out a menu for the user to choose input from. If the
	 * user's input does not match the menu, it will print an error. Once numbers
	 * have been entered from the first option on the menu, subsequent choices will
	 * perform calculations using the numbers entered by the user. If numbers have
	 * not been entered by the user, it will print an error. The method will repeat
	 * until the exit option is chosen by the user.
	 * 
	 * @param args A String array containing any command line options.
	 */
	public static void main(String[] args) {
		// Constants and Variables
		boolean enteredNumbers = false;
		double[] numbers = new double[5];
		char userInput = '\0';

		// Calculator
		do {
			// Menu Prompt and User Input
			userInput = runCalculatorMenu(numbers);

			// Input Processing
			processUserInput(userInput, enteredNumbers, numbers);

			// Validation of Numbers Received
			if (userInput == 'N') {
				enteredNumbers = true;
			}
		} while (userInput != 'X');
	}

	/**
	 * This method takes a quantity of numbers and adds them together.
	 * 
	 * @param numToAdd An array of any numbers.
	 * @return This method returns the sum of all numbers passed to it.
	 */
	public static double addNumbers(double[] numToAdd) {
		// Constants and Variables
		double sum = numToAdd[0];

		// Calculations
		for (int i = 1; i < numToAdd.length; ++i) {
			sum += numToAdd[i];
		}

		return sum;
	}

	/**
	 * This method receives a quantity of numbers and divides them together to
	 * create a quotient. This method will not handle the divide by zero error.
	 * 
	 * @param numToDiv An array of any numbers.
	 * @return This method returns the quotient of all numbers passed to it.
	 */
	public static double divNumbers(double[] numToDiv) {
		// Constants and Variables
		double quotient = numToDiv[0];

		// Calculations
		for (int i = 1; i < numToDiv.length; ++i) {
			quotient /= numToDiv[i];
		}

		return quotient;
	}

	/**
	 * This method receives a quantity of numbers and calculates the average of
	 * them.
	 * 
	 * @param numToAvg An array of any numbers.
	 * @return This method returns the average of all numbers passed to it.
	 */
	public static double getAvg(double[] numToAvg) {
		// Constants and Variables
		double avg = numToAvg[0];

		// Calculations
		for (int i = 1; i < numToAvg.length; ++i) {
			avg += numToAvg[i];
		}
		avg /= numToAvg.length;

		return avg;
	}

	/**
	 * This method will determine the largest number of all numbers it is given.
	 * 
	 * @param numToMax An array of any numbers.
	 * @return This method returns the largest number of all numbers passed to it.
	 */
	public static double getMax(double[] numToMax) {
		// Constants and Variables
		double max = numToMax[0];

		// Comparisons
		for (int i = 0; i < numToMax.length; ++i) {
			// Validation of Maximum Number
			if (numToMax[i] > max) {
				max = numToMax[i];
			}
		}

		return max;
	}

	/**
	 * This method will determine the smallest number of all numbers it is given.
	 * 
	 * @param numToMin An array of any numbers.
	 * @return This method returns the smallest number of all numbers passed to it.
	 */
	public static double getMin(double[] numToMin) {
		// Constants and Variables
		double min = numToMin[0];

		// Comparisons
		for (int i = 0; i < numToMin.length; ++i) {
			// Validation of Smallest Number
			if (numToMin[i] < min) {
				min = numToMin[i];
			}
		}

		return min;
	}

	/**
	 * This method will print a prompt for the user to enter an amount of numbers.
	 * 
	 * @param userNumbers An array to be filled with a set of any numbers.
	 */
	public static void getNumbers(double[] userNumbers) {
		// Constants and Variables
		Scanner input = new Scanner(System.in);

		// Prompt and User Input
		System.out.print("Enter " + userNumbers.length + " numbers separated with spaces: ");
		for (int i = 0; i < userNumbers.length; ++i) {
			userNumbers[i] = input.nextDouble();
		}
	}

	/**
	 * This method will print the position and sign (positive, negative, or zero) of
	 * all numbers it is given.
	 * 
	 * @param numToSign An array of any numbers.
	 */
	public static void getSign(double[] numToSign) {
		// Determination of Sign
		for (int i = 0; i < numToSign.length; ++i) {
			if (numToSign[i] > 0) {
				// Positive Output
				System.out.println("The number in position " + (i + 1) + " is positive.\n");
			} else if (numToSign[i] < 0) {
				// Negative Output
				System.out.println("The number in position " + (i + 1) + " is negative.\n");
			} else {
				// Zero Output
				System.out.println("The number in position " + (i + 1) + " is zero.\n");
			}
		}
	}

	/**
	 * This method receives a quantity of numbers and determines if any of them are
	 * zero.
	 * 
	 * @param numbers An array of any numbers.
	 * @return This method returns true if there is a zero in the passed array, and
	 *         false if there are none.
	 */
	public static boolean hasZero(double[] numbers) {
		// Constants and Variables
		boolean zeroFound = false;

		// Comparisons
		for (int i = 0; zeroFound != true && i < numbers.length; ++i) {
			// Validation of the Presence of Zero
			if (numbers[i] == 0) {
				zeroFound = true;
			}
		}

		return zeroFound;
	}

	/**
	 * This method receives a quantity of numbers and multiplies them together to
	 * create a product.
	 * 
	 * @param numToMult An array of any numbers.
	 * @return This method returns the product of all numbers passed to it.
	 */
	public static double multNumbers(double[] numToMult) {
		// Constants and Variables
		double product = numToMult[0];

		// Calculations
		for (int i = 1; i < numToMult.length; ++i) {
			product *= numToMult[i];
		}

		return product;
	}

	/**
	 * This method will print output in the proper format for the addNumbers,
	 * subNumbers, multNumbers, and divNumbers functions.
	 * 
	 * @param operation The mathematical symbol to be printed out. 
	 * 		  userNumbers The array of numbers to be printed out.
	 */
	public static void printOutputFormatASMD(char operation, double[] userNumbers) {
		// Output
		System.out.print("Answer: ");
		for (int i = 0; i < userNumbers.length; ++i) {
			System.out.printf("%.3f", userNumbers[i]);
			if (i < (userNumbers.length - 1)) {
				System.out.print(" " + operation + " ");
			}
		}
		// Answer Output
		switch (operation) {
		case '+':
			System.out.printf(" = %.3f", addNumbers(userNumbers));
			break;
		case '-':
			System.out.printf(" = %.3f", subNumbers(userNumbers));
			break;
		case '*':
			System.out.printf(" = %.3f", multNumbers(userNumbers));
			break;
		case '/':
			System.out.printf(" = %.3f", divNumbers(userNumbers));
			break;
		}
		
	}

	/**
	 * This method will print output in the proper format for the getAvg function.
	 * 
	 * @param userNumbers The array of numbers to be printed out.
	 */
	public static void printOutputFormatV(double[] userNumbers) {
		// Output
		System.out.print("Answer: (");
		for (int i = 0; i < userNumbers.length; ++i) {
			System.out.printf("%.3f", userNumbers[i]);
			if (i < (userNumbers.length - 1)) {
				System.out.print(" + ");
			}
		}
		System.out.printf(") / %i = %.3f", userNumbers.length,  getAvg(userNumbers));
	}

	/**
	 * This method will call calculation and print methods to output a formatted
	 * answer based on the user's input. It will also print error messages for an
	 * unusable user input and for a possible division by zero.
	 * 
	 * @param input The user's input choice after the menu prompt. 
	 * 		  numbersReceived Determines whether the user has entered numbers or not.
	 *        userNumbers An array of numbers chosen by the user.
	 */
	public static void processUserInput(char input, boolean numbersReceived, double[] userNumbers) {
		// Menu Choice Processing
		switch (input) {
		// Numbers
		case 'N':
			// Input
			getNumbers(userNumbers);
			break;
		// Addition
		case 'A':
			// Validation of Numbers Received
			if (numbersReceived) {
				// Output
				printOutputFormatASMD('+', userNumbers);
			} else {
				// Output
				System.out.println("Error: Please select option N from the menu first!\n");
			}
			break;
		// Subtraction
		case 'S':
			// Validation of Numbers Received
			if (numbersReceived) {
				// Output
				printOutputFormatASMD('-', userNumbers);
			} else {
				// Output
				System.out.println("Error: Please select option N from the menu first!");
			}
			break;
		// Multiplication
		case 'M':
			// Validation of Numbers Received
			if (numbersReceived) {
				// Output
				printOutputFormatASMD('*', userNumbers);
			} else {
				// Output
				System.out.println("Error: Please select option N from the menu first!\n");
			}
			break;
		// Division
		case 'D':
			// Validation of Numbers Received
			if (numbersReceived) {
				// Validation of Zero
				if (!hasZero(userNumbers)) {
					// Output
					printOutputFormatASMD('/', userNumbers);
				} else {
					// Output
					System.out.println("Error: Cannot divide by Zero!\n");
				}
			} else {
				// Output
				System.out.println("Error: Please select option N from the menu first!\n");
			}
			break;
		// Average
		case 'V':
			// Validation of Numbers Received
			if (numbersReceived) {
				// Output
				printOutputFormatV(userNumbers);
			} else {
				// Output
				System.out.println("Error: Please select option N from the menu first!\n");
			}
			// Maximum
		case 'L':
			// Validation of Numbers Received
			if (numbersReceived) {
				// Calculation and Output
				System.out.printf("The largest number is %.3f.\n\n", getMax(userNumbers));
			} else {
				// Output
				System.out.println("Error: Please select option N from the menu first!\n");
			}
			break;
		// Minimum
		case 'E':
			// Validation of Numbers Received
			if (numbersReceived) {
				// Calculation and Output
				System.out.printf("The smallest number is %.3f.\n\n", getMin(userNumbers));
			} else {
				// Output
				System.out.println("Error: Please select option N from the menu first!\n");
			}
			break;
		// Positive, Negative, or Zero
		case 'I':
			// Validation of Numbers Received
			if (numbersReceived) {
				// Calculation and Output
				getSign(userNumbers);
			} else {
				// Output
				System.out.println("Error: Please select option N from the menu first!\n");
			}
			break;
		// Exit
		case 'X':
			// Output
			System.out.println("Thank you for using Eric's calculator. Good-bye!\n");
			break;
		// Error Message
		default:
			// Output
			System.out.println("Error: Invalid choice!\n");
		}
	}

	/**
	 * This method will print out a basic user interface prompting the user to pick
	 * an option. The options are: get ? (N)umbers (where ? represents the quantity 
	 * of numbers to enter decided in main), (A)dd the numbers, (S)ubtract
	 * the numbers, (M)ultiply the numbers, (D)ivide the numbers, determine the
	 * (L)argest number, determine the small(E)st number, determine the s(I)gn of
	 * each number, and e(X)it. The method will then receive the user's character
	 * input.
	 * 
	 * @param userNums An array of any numbers.
	 * @return This method will return a character chosen by the user.
	 */
	public static char runCalculatorMenu(double[] userNumbers) {
		// Constants and Variables
		Scanner input = new Scanner(System.in);
		char userInput;

		// Menu Output
		System.out.print("Calculator Menu\n\n" + "Get " + userNumbers.length + " (N)umbers.\n" + "(A)dd the numbers.\n"
				+ "(S)ubtract the numbers.\n" + "(M)ultiply the numbers.\n" + "(D)ivide the numbers.\n"
				+ "Determine the (L)argest number.\n" + "Determine the small(E)st number.\n"
				+ "Determine the s(I)gn of each number.\n" + "E(X)it.\n\n" + "Choice: ");
		// User Input
		userInput = Character.toUpperCase(input.next().charAt(0));

		return userInput;
	}

	/**
	 * This method takes a quantity of numbers and subtracts them from each other.
	 * 
	 * @param numToSub: An array of doubles
	 * @return This method returns the difference of all numbers passed to it.
	 */
	public static double subNumbers(double[] numToSub) {
		// Constants and Variables
		double difference = numToSub[0];

		// Calculations
		for (int i = 1; i < numToSub.length; ++i) {
			difference -= numToSub[i];
		}

		return difference;
	}
}
