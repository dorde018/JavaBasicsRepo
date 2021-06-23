package javaBasics;

import java.util.Scanner;

public class ReturnLastAndPenultimateDigitFunction {
	static boolean oneDigitNumber = false;
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Please enter any integer: ");
		int anyNumber = s.nextInt();
		System.out.println("Number that you entered is: " + anyNumber + ".");
		int lastDigitOfAnyNumber = returnLastDigit(anyNumber);
		System.out.println("Last digit of the number: " + anyNumber + " is " + lastDigitOfAnyNumber + ".");
		int penultimateDigitOfAnyNumber = returnPenultimateDigit(anyNumber);
		if ( oneDigitNumber == false) {
			System.out.println("Penultimate digit of the number: " + anyNumber + " is " + penultimateDigitOfAnyNumber + ".");
		}
	}
	public static int returnLastDigit(int n) {
		int lastDigit = n % 10;
		if (lastDigit < 0) {
			lastDigit *= -1;
		}
		return lastDigit;
	}
	public static int returnPenultimateDigit(int n) {
		if (n < 0) {
			n *= -1;
		}
		if (n < 10) {
			System.out.println("The number is one-digit number and does not contain the penultimate digit.");
			oneDigitNumber = true;
		}
		int penultimateDigit;
		int lastDigit = returnLastDigit(n);
		int numberOfTens = n - lastDigit;
		int withoutLastDigit = numberOfTens / 10;
		penultimateDigit = returnLastDigit(withoutLastDigit);
	
		return penultimateDigit;
	}
}

