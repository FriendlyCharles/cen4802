package com.MavenCalculator;

import junit.framework.TestCase;

public class AppTest2 extends TestCase {

	public void testGetAvg() {
		double[] numToAvg = {1, 2, 3, 4};
		double avg = numToAvg[0];

		// Calculations
		for (int i = 1; i < numToAvg.length; ++i) {
			avg += numToAvg[i];
		}
		avg /= numToAvg.length;

		assertEquals(avg, 2.5);
	}

	public void testGetMax() {
		double[] numToMax = {1, 2, 3, 4};
		// Constants and Variables
		double max = numToMax[0];

		// Comparisons
		for (int i = 0; i < numToMax.length; ++i) {
			// Validation of Maximum Number
			if (numToMax[i] > max) {
				max = numToMax[i];
			}
		}

		assertEquals(max, 4.0);
	}

	public void testGetMin() {
		double[] numToMin = {1, 2, 3, 4};
		// Constants and Variables
		double min = numToMin[0];

		// Comparisons
		for (int i = 0; i < numToMin.length; ++i) {
			// Validation of Smallest Number
			if (numToMin[i] < min) {
				min = numToMin[i];
			}
		}

		assertEquals(min, 1.0);
	}

	public void testHasZero() {
		double[] numbers = {1, 2, 3, 4, 0};
		// Constants and Variables
		boolean zeroFound = false;

		// Comparisons
		for (int i = 0; zeroFound != true && i < numbers.length; ++i) {
			// Validation of the Presence of Zero
			if (numbers[i] == 0) {
				zeroFound = true;
			}
		}

		assertEquals(zeroFound, true);
	}
}
