package javaBasics;

import java.util.Scanner;

public class MonthsOfTheYear {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Please enter the desired month number, and the program will print the answer: ");
		int numberOfTheDays = s.nextInt();
		
		switch (numberOfTheDays) {
		case 28:{System.out.println("Only one month of the year has 28 days. It is February.\n"
				+ "Every leap year February has 29 days.");
		break;
		}
		case 29:{System.out.println("Only February has 29 days a year, and not every year, but every leap year.");
		break;
		}
		case 30:{System.out.println("The Gregorian calendar has 4 months that are 30 days long.\nThose are: April, June, September and November. ");
		break;
		}
		case 31:{System.out.println("The Gregorian calendar has 7 months that are 31 days long.\nThose are: January, March, May, July, August, October and December.");
		break;
		}
		default:{System.out.println("Invalid input!\nPlease run the program again and enter one of the valid month numbers: 28, 29, 30 or 31.\nThank you for using our program.");
			break;
		}
		
	}

}
}

