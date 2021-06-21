package javaBasics;

import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		double pounds;
		String currency;
		System.out.println("Please enter the amount in pounds: ");
		pounds = s.nextDouble();
		while(pounds<=0) {
			System.out.println("Invalid input. Please enter value greater than 0.");
			System.out.println("Please enter the amount in pounds: ");
			pounds = s.nextDouble();
		}
		System.out.println("Please enter the currency into which to convert pounds: ");
		currency = s.next().toLowerCase();
		
		if ((currency.equals("euro") && pounds != 1.0) || (currency.equals("franc") && pounds != 1.0) || (currency.equals("dollar") && pounds != 1.0)){
		double myCalculator = converter(currency, pounds);
		System.out.println("When the "+ pounds + " pounds are converted into " + currency + "s you get "+ myCalculator + " in that currency.");
		
		}else if((currency.equals("euro") && pounds == 1.0) || (currency.equals("franc") && pounds == 1.0) || (currency.equals("dollar") && pounds == 1.0)) {
			double myCalculator = converter(currency, pounds);
			System.out.println("When the "+ pounds + " pound is converted into " + currency+ " you get " + myCalculator + " in that currency.");
		}
		else{
			System.out.println("The currencies you can enter to do the successful calculation are: EURO, FRANC and DOLLAR.\nPlease, run the program again and try again.");
	
		}
	System.out.println("----------------------------------");
	System.out.println("Thank you for using our converter.");
	System.out.println("----------------------------------");
	}
	
	public static double converter(String currency, double amount) {
		double result = 0;
		if (currency.equals("euro")) {
			result = amount * 1.17;
		}else if(currency.equals("franc")) {
			result = amount * 1.28;
		}else if(currency.equals("dollar")) {
			result = amount * 1.40;
		}
		return result;
	}

}

