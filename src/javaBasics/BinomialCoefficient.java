package javaBasics;

import java.util.Scanner;

public class BinomialCoefficient {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int a;
		int b;
		System.out.println("Please insert integer A: ");
		a = s.nextInt();
		System.out.println("Please insert integer B: ");
		b = s.nextInt();
		int result = binomial(a, b);
		System.out.println("The result is: " + result);
		
	}
	public static int binomial(int a, int b) {
		if (a < b) {
			return  0;
		}
		else if (b == 0 || b == a) { 
			return 1;		
		}
		else { 
		return	binomial(a-1, b-1) + binomial(a-1, b);
		
		}
	}
}
