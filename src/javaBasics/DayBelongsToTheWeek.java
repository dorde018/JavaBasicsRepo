package javaBasics;

import java.util.Scanner;

public class DayBelongsToTheWeek {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String week = "week of the year.";
		System.out.println("By entering the integer, program will count to what week of the year the day belongs.\nPlease enter the integer:");
		int enteredDay = s.nextInt();
		float result = enteredDay / 7f;
		
		while(true) {
		
		if(enteredDay == 365) {
			System.out.println("The entered day belongs to 52. week of the year.");	
			break;
		}else if (enteredDay >= 1 && enteredDay <= 7) {
			System.out.println("The entered day belongs to the first week of the year.");
			enteredDay = s.nextInt();
		}
		else if (enteredDay < 1) {
			System.out.println("Ivalid input! Please run the program again "
					+ "and enter the valid input.\nValid inputs are integers equal or greater than 1 and equal and less than 365.");
			enteredDay = s.nextInt();
		}
		else if
			(enteredDay > 365) {
			System.out.println("Ivalid input! Please run the program again "
					+ "and enter the valid input.\nValid inputs are integers equal or greater than 1 and equal and less than 365.");
			enteredDay = s.nextInt();
		}
		else if(enteredDay >= 8 && enteredDay < 365) {
			System.out.println("The entered day belongs to "+ (int) Math.ceil(result) + ". " + week);	
			break;
		}
		
		}
	}

}

