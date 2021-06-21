package javaBasics;

import java.util.Scanner;

public class ReturnLastDigitFunction {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter any number: ");
		int anyNumber = s.nextInt();
		
		int lastDigit = returnLastDigit(anyNumber);
		System.out.println("Last digit of the entered number is: " + lastDigit + ".");
		System.out.println("---------------------------------------");
		System.out.println("Thank you for using our program!");
	}

	public static int returnLastDigit(int n) {
		int lastDigit = n % 10;
		if (lastDigit < 0) {
			lastDigit *= -1;
		}
		return lastDigit;
	
	}
	
}
