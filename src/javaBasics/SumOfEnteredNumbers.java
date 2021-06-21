package javaBasics;

import java.util.Scanner;

public class SumOfEnteredNumbers {

	public static void main(String[] args) {
		int number;
		Scanner s = new Scanner (System.in);
		int sum=0;
		int counter=1;
		System.out.println("Please enter the " + counter + ". number: ");
		number =s.nextInt();
		sum+=number;
		counter++;
		while(number!=0){
			System.out.println("Please enter the " + counter + ". number: ");
			number =s.nextInt();
			sum+=number;
			System.out.println("Current sum is: " + sum);
			counter++;
			if (number==0) {
				System.out.println("You have no more attempts, you have entered 0.\nSum total is: " + sum);
			}
		}				
			System.out.println("End of program");
		} 	
	
}


