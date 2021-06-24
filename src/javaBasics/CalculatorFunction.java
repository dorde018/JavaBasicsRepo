package javaBasics;
import java.util.Scanner;

public class CalcultaorFunction{
	public static void main(String[] args) {
		int numA, numB;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the first integer:");
		numA = s.nextInt();
		System.out.println("Please enter the second integer:");
		numB = s.nextInt();
		System.out.println("Please enter desired mathematical operation:");
		String operation=s.next().toLowerCase();
		
		while (true){
			if(operation.equals("addition")) {
				System.out.println("When the " + operation + " mathematical operation is performed on numbers: " + numA + " and " + numB +", the result is: "+ calculator(numA,numB,operation) + ".");
				break;
			}else if(operation.equals("deduction")) {
				System.out.println("When the " + operation + " mathematical operation is performed on numbers: " + numA + " and " + numB +", the result is: "+ calculator(numA, numB, operation) + ".");
				break;
			}else if(operation.equals("division")) {
				System.out.println("When the " + operation + " mathematical operation is performed on numbers: " + numA + " and " + numB +", the result is: "+ calculator(numA, numB, operation) + ".");
				break;
			}else if(operation.equals("remainder")) {
				System.out.println("When the " + operation + " after dividing mathematical operation is performed on numbers: " + numA + " and " + numB +", the result is: "+ calculator(numA, numB, operation) + ".");
				break;
			}else if(operation.equals("multiplication")) {
				System.out.println("When the " + operation + " mathematical operation is performed on numbers: " + numA + " and " + numB +", the result is: "+ calculator(numA, numB, operation) + ".");
				break;
			}else {
			System.out.println("\nInvalid operation is entered. Please enter one of the valid operations.");
			System.out.println("Valid operations are:\nADDITION\nDEDUCTION\nDIVISION\nREMAINDER AFTER DIVIDING\nMULTIPLICATION");
			System.out.println("-----------------------");
			System.out.println("Please enter desired mathematical operation:");
			operation=s.next().toLowerCase();
			}
		}
	
	}
	public static double calculator(int firstNum, int secondNum, String operator) {
		double result=0;
		if(operator.equals("addition")) {
			result = firstNum + secondNum;
		}else if (operator.equals("deduction")) {
			result = firstNum - secondNum;
		}else if (operator.equals("division")) {
			result = firstNum / secondNum;
		}else if(operator.equals("remainder")){
			result = firstNum % secondNum;
		}else if (operator.equals("multiplication")){
			result = firstNum * secondNum;
		}
		return result;
	}
}
