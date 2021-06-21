package javaBasics;

import java.util.Scanner;


public class LuckyNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int num = 0;
		int luckyNumber;
		int numAttempts;
		System.out.println("How many attempts do you want to have: ");
		numAttempts = s.nextInt();
		System.out.println("Enter your lucky number: ");
		luckyNumber = s.nextInt();
		int verificationNumber = 1;
		
		for (int i = 1; i <=numAttempts; i++) {
			System.out.println("Enter " + i +" desired number: ");
			num = s.nextInt();
		
			if(num == luckyNumber) {
				System.out.println("--------------------------------------------------");
				System.out.println("Your lucky number is found. CONGRATULATIONS!");
				System.out.println("--------------------------------------------------");
				break;
			}
			else if(verificationNumber == 1) {
				if(i == numAttempts - 1) {	
					System.out.println("This is your last attempt!");
					verificationNumber++;
				}else {
					System.out.println("We did not find a desired number. Please try again.");	
				}
			}
		}
		if (luckyNumber != num) {
			System.out.println("--------------------------------");
			System.out.println("You ran out of attempts.");
			System.out.println("--------------------------------");
			System.out.println("Thank you for using our program.\nRun the program again, and have fun!");
		}else {		
			System.out.println("Thank you for using our program.");
		}
	}

}
