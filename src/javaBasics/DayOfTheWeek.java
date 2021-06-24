package javaBasics;

import java.util.Scanner;

public class DayOfTheWeek {
	public static void main(String[] args) {
	String dayOfTheWeek;
	
	Scanner s = new Scanner(System.in);
	System.out.println("Please enter the day of the week:");
	
	dayOfTheWeek = s.next().toLowerCase();
	
	switch (dayOfTheWeek) {
	case "monday": {
		System.out.print("Monday falls on: ");
		for (int i = 1; i <= 31; i = i + 7) {
			if((31-i) >= 7) {
			System.out.print(i + ", ");
			}else {
			System.out.print("and " + i);
			}
		}
		System.out.print(" day of the month.");
		break;
	}
	case "tuesday": {
		System.out.println("Tuesday falls on: ");
		for (int i = 2; i <= 31; i = i + 7) {
			if((31-i) >= 7) {
				System.out.print(i + ", ");
				}else {
				System.out.print("and " + i);
				}
		}
		System.out.println(" day of the month.");
		break;
	}
	case "wednesday": {
		System.out.println("Wednesday falls on: ");
		for (int i = 3; i <= 31; i = i + 7) {
			if((31-i) >= 7) {
				System.out.print(i + ", ");
				}else {
				System.out.print("and " + i);
				}
		}
		System.out.println(" day of the month.");
		break;
	}
	case "thursday": {
		System.out.println("Thursday falls on: ");
		for (int i = 4; i <= 31; i = i + 7) {
			if((31-i) >= 7) {
				System.out.print(i + ", ");
				}else {
				System.out.print("and " + i);
				}
		}
		System.out.println(" day of the month.");
		break;
	}
	case "friday": {
		System.out.println("Friday falls on: ");
		for (int i = 5; i <= 31; i = i + 7) {
			if((31-i) >= 7) {
				System.out.print(i + ", ");
				}else {
				System.out.print("and " + i);
				}
		}
		System.out.println(" day of the month.");
		break;
	}
	case "saturday": {
		System.out.println("Saturday falls on: ");
		for (int i = 6; i <= 31; i = i + 7) {
			if((31-i) >= 7) {
				System.out.print(i + ", ");
				}else {
				System.out.print("and " + i);
				}
		}
		System.out.println(" day of the month.");
		break;
	}
	case "sunday": {
		System.out.println("Sunday falls on: ");
		for (int i = 7; i <= 31; i = i + 7) {
			if((31-i) >= 7) {
				System.out.print(i + ", ");
				}else {
				System.out.print("and " + i);
				}
		}
		System.out.println(" day of the month.");
		break;
	}
	default:
		System.out.println("You entered the incorrect input. Please run the program again and enter one of the days of the week:"
			+ "\nMonday\nTuesday\nWednesday\nThursday\nFriday\nSaturday\nSunday");
	}
}
}
