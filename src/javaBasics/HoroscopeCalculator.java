package javaBasics;

import java.util.Scanner;

public class HoroscopeCalculator{

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String  month;
		int dayOfTheMonth;
		System.out.println("Welcome to HOROSCOPE CALCULATOR!");
		System.out.println("--------------------------------");
		
		while (true) {
			System.out.println("Please enter the name of the month of the year: ");
			month=s.next().toLowerCase();
			if(month.equals("january") || month.equals("february")){
				break;
			}else if(month.equals("march") || month.equals("april")){
				break;
			}else if(month.equals("may") || month.equals("june")){
				break;
			}else if(month.equals("july") || month.equals("august")){
				break;
			}else if(month.equals("september") || month.equals("october")){
				break;
			}else if(month.equals("november") || month.equals("december")){
				break;
			}
		}
		System.out.println("Please enter the day of the month by entering integer: ");
		dayOfTheMonth =s.nextInt();
		while ((dayOfTheMonth<=0)||(dayOfTheMonth>=32)) {
		System.out.println("Invalid input. Enter a valid number of the days in the month.\nThe number of days must be equal to or greater than 1 and"
				+ " must not be greater than 31.\nThank you.");	
		System.out.println("\nPlease enter the day of the month by entering integer: ");
		dayOfTheMonth =s.nextInt();
		}
		
		switch (month) {
		
		case "january":
		if(dayOfTheMonth <= 19 ) {
			System.out.println("-----------------------------------------");
			System.out.println("Your zodiac sign is CAPRICORN.");
			break;
		}else if(dayOfTheMonth >= 20 && dayOfTheMonth <= 31) {
			System.out.println("-----------------------------------------");
			System.out.println("Your zodiac sign is AQUARIUS.");
			break;
		}
		case "february":
		if (dayOfTheMonth <= 18) {
			System.out.println("-----------------------------------------");
			System.out.println("Your zodiac sign is AQUARIUS.");
			break;
		}else if(dayOfTheMonth >= 19 && dayOfTheMonth <= 29) {
			System.out.println("-----------------------------------------");
			System.out.println("Your zodiac sign is PISCES.");
			break;
		}else {
			System.out.println("February has 28 days.\nEvery leap year February has 29 days."
					+ "\nPlease run the calculator again and enter the integer in the range of 1 to 29.");
			break;
		}
		case "march":
		if (dayOfTheMonth <= 20) {
			System.out.println("-----------------------------------------");
			System.out.println("Your zodiac sign is PISCES.");
			break;
		}else if (dayOfTheMonth >= 21 && dayOfTheMonth <= 31) {
			System.out.println("-----------------------------------------");
			System.out.println("Your zodiac sign is ARIES.");
			break;
		}
		case "april":
		if (dayOfTheMonth <= 19) {
			System.out.println("-----------------------------------------");
			System.out.println("Your zodiac sign is ARIES.");
			break;
		}else if (dayOfTheMonth >= 20 && dayOfTheMonth <= 30) {
			System.out.println("-----------------------------------------");
			System.out.println("Your zodiac sign is TAURUS.");
			break;
		}else {
			System.out.println("April has 30 days.\nPlease run the calculator again and enter the integer in the range of 1 to 30.");
			break;
		}
		case "may":
		if (dayOfTheMonth <= 20) {
			System.out.println("-----------------------------------------");
			System.out.println("Your zodiac sign is TAURUS.");
			break;
		}else if(dayOfTheMonth >= 21 && dayOfTheMonth <= 31) {
			System.out.println("-----------------------------------------");
			System.out.println("Your zodiac sign is GEMINI.");
			break;
		}
		case "june":
		if (dayOfTheMonth <= 20) {
			System.out.println("-----------------------------------------");
			System.out.println("Your zodiac sign is GEMINI.");
			break;
		}else if (dayOfTheMonth >=21 && dayOfTheMonth <= 30) {
			System.out.println("-----------------------------------------");
			System.out.println("Your zodiac sign is CANCER.");
			break;
		}else {
			System.out.println("Jun has 30 days.\nPlease run the calculator again and enter the integer in the range of 1 to 30.");
			break;
		}
		case "july":
		if (dayOfTheMonth <=22) {
			System.out.println("-----------------------------------------");
			System.out.println("Your zodiac sign is CANCER.");
			break;
		}else if (dayOfTheMonth >= 23 && dayOfTheMonth <= 31) {
			System.out.println("-----------------------------------------");
			System.out.println("Your zodiac sign is LEO.");
			break;
		}
		case "august":
		if(dayOfTheMonth <= 22) {
			System.out.println("-----------------------------------------");
			System.out.println("Your zodiac sign is LEO.");
			break;
		}else if(dayOfTheMonth >= 23 && dayOfTheMonth <=31) {
			System.out.println("-----------------------------------------");
			System.out.println("Your zodiac sign is VIRGO.");
			break;
		}
		case "september":
		if(dayOfTheMonth <= 22) {
			System.out.println("-----------------------------------------");
			System.out.println("Your zodiac sign is VIRGO.");
			break;
		}else if (dayOfTheMonth >=23 && dayOfTheMonth <= 30) {
			System.out.println("-----------------------------------------");
			System.out.println("Your zodiac sign is LIBRA.");
			break;
		}else {
			System.out.println("September has 30 days.\nPlease run the calculator again and enter the integer in the range of 1 to 30.");
			break;
		}
		case "october":
		if (dayOfTheMonth <=22) {
			System.out.println("-----------------------------------------");
			System.out.println("Your zodiac sign is LIBRA.");
			break;
		}else if(dayOfTheMonth >= 23 && dayOfTheMonth <=31) {
			System.out.println("-----------------------------------------");
			System.out.println("Your zodiac sign is SCORPIO.");
			break;
		}
		case "november":
		if (dayOfTheMonth <= 21) {
			System.out.println("-----------------------------------------");
			System.out.println("Your zodiac sign is SCORPIO.");
			break;
		}else if (dayOfTheMonth >= 22 && dayOfTheMonth <= 30) {
			System.out.println("-----------------------------------------");
			System.out.println("Your zodiac sign is SAGITTARIUS.");
			break;
		}else {
			System.out.println("November has 30 days.\nPlease run the calculator again and enter the integer in the range of 1 to 30.");
			break;
		}
		case "december":		
		if (dayOfTheMonth <=21 ) {
			System.out.println("-----------------------------------------");
			System.out.println("Your zodiac sign is SAGITTARIUS.");
			break;
		}else if (dayOfTheMonth >=22 && dayOfTheMonth <=31) {
			System.out.println("-----------------------------------------");
			System.out.println("Your zodiac sign is CAPRICORN.");
			break;
		}
		default:
			break;
		}
		System.out.println("-----------------------------------------");
		System.out.println("Thank you for using HOROSCOPE CALCULATOR");
		System.out.println("-----------------------------------------");
	}
	
}
