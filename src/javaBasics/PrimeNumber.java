package javaBasics;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = 0;
		int sum = 0;
		int n;
	
		System.out.println("Please enter the integer for which you would like program to check if it is prime:");
		n = s.nextInt();
		while ( n <= 0) {
			System.out.println("Please enter an integer equal to or greater than 1.");
			System.out.println("Enter the number for which you would like program to check if it is prime:");
			n = s.nextInt();	
		}
		for (a = 1; a <= n; a++)
			if (n % a == 0) sum += a;
		
		if (sum == n + 1)
			System.out.println("The number is prime.");
		else
			System.out.println("The number is not prime.");		
		System.out.println("\nThank you for using our calculator.");
}
}
