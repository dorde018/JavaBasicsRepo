package javaBasics;

import java.util.Scanner;

	public class CountingRepatedNumberInArrayFunction {
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int [] arrayOfNumbers = { 6, 5, 12, 6, 8, 13, 4, 2, 18, 2, 44, 59, 6, 187, 11, 67, 8, 72 };
			System.out.println("Enter the number you want to count in the array: ");
			int selectedNumber = s.nextInt();
			int numOfRepetitions = counterOfRepeatedNumberInArray(arrayOfNumbers, selectedNumber);
			
			if (numOfRepetitions == 0) {
				System.out.println("Number " + selectedNumber + " does not exist in the array.");
			}else if(numOfRepetitions == 1) {
				System.out.println("Number " + selectedNumber + " repeats " + numOfRepetitions + " time in the array.");
			}
			else {
				System.out.println("Number " + selectedNumber + " repeats " + numOfRepetitions + " times in the array.");
			}
			System.out.println("\nThank you for using our program!");
		}
		public static int counterOfRepeatedNumberInArray(int[] array, int selectedNumber) {
			int counter = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i] == selectedNumber) {
					 counter++;
				}
			}
			return counter;
		}
	}

