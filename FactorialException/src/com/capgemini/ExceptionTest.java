/*Program to find the factorial which throws exception*/
package com.capgemini;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		Factorial fac = new Factorial(1);
		int fact;
		try {
			fact = fac.getFactorial(5); // Calls getFactorial method
			System.out.println("Factorial is :" + fact);

		} catch (InvalidInputException e) {
			e.printStackTrace();
		} catch (FactorialException e) {
			e.printStackTrace();
		}

	}

}
