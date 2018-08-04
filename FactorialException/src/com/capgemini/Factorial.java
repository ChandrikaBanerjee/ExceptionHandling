/*Program to find the factorial which throws exception*/
package com.capgemini;

public class Factorial extends Exception {
	private int num;
	int fact = 1;

	public Factorial(int num) {

		this.num = num;
	}

//Throws InvalidInputException and FactorialException
	public int getFactorial(int num) throws InvalidInputException, FactorialException {
		this.num = num;
		// Throws InvalidInputException
		if (num < 2) {
			throw new InvalidInputException("Exception occurs.");
		} else {
			for (int i = 1; i <= num; i++) {
				fact = fact * i;
			}

		}
		// Throws
		if (fact > 2147483647) {
			throw new FactorialException("Factorial Exception Occurs");
		}
		return fact;
	}

}
