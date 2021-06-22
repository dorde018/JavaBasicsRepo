package javaBasics;

import java.util.Scanner;

public class NumberIsPostiveOrNegative {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int number;
		System.out.println("Please enter any number: ");
		number = s.nextInt();
		
		String result = returnResult(number);
		System.out.println(result);
		System.out.println("End of the program. Thank you!");
		
	}
	static public String returnResult(int num) {
		String result= "";
		if(num > 0){
			System.out.println("Entered number is positive.");
		}else if(num < 0){
			System.out.println("Entered number is negative.");
		}else if(num == 0){
			System.out.println("Entered number is zero.");
		}
		return result;
	}
		
}

