package javaBasics;

import java.util.Scanner;

public class TwoDigitNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int twoDigitNumber;
		int firstDigit;
		int secondDigit;
		System.out.println("Please enter the two-digit integer: ");
		twoDigitNumber = s.nextInt();
		
		while(true) {
			if(twoDigitNumber >= -99 && twoDigitNumber <= -10) {
				firstDigit = twoDigitNumber / 10;
				secondDigit = twoDigitNumber % 10;
				System.out.println("\nThe first digit of entered number is: " + firstDigit + ", and the second digit of entered number is: " + secondDigit + ".\n");
				break;
			}else if(twoDigitNumber <= 99 && twoDigitNumber >=10){
				firstDigit = twoDigitNumber / 10;
				secondDigit = twoDigitNumber % 10;
				System.out.println("\nThe first digit of entered number is: " + firstDigit + ", and the second digit of entered number is: " + secondDigit + ".\n");
				break;
			}else {
				
				System.out.println("Invalid input. The entered number has to be two-digit number.\nPlease enter the two-digit number: ");
				twoDigitNumber = s.nextInt();
			}
		}
		System.out.println("End of the program. Thank you for using our calculator.");
	}

}
