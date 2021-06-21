package javaBasics;

import java.util.Scanner;

public class ConsumptionCounter {

	public static void main(String[] args) {
		double distance;
		String type;
		Scanner s = new Scanner (System.in);
		System.out.println("Please enter the distance in kilometers: ");
		distance = s.nextInt();
		while(distance <= 0){
			System.out.println("Invalid input. Distance has to be greater than 0.");
			System.out.println("Please enter the distance in kilometers: ");
			distance = s.nextInt();
		}
		
		System.out.println("Please enter the type of vehicle: ");
		type = s.next().toLowerCase();
		
		switch (type) {
		case "motorcycle":{
			double consumption;
			consumption = (distance*5) / 100;
			System.out.println("For distance traveled, the motorcycle will consume: " + consumption+ " liters of fuel.");
			
			break;
			}
		case "car":{
			double consumption;
			consumption = (distance*7) / 100;
			System.out.println("For the distance traveled, the car will consume: " + consumption+ " liters of fuel.");
			
			break;
		}
		case "van":{
			double consumption;
			consumption = (distance*11) / 100;
			System.out.println("For the distance traveled, the van will consume: " + consumption + " liters of fuel.");
			
			break;
		}
		case "truck":{
			double consumption;
			consumption = (distance*15) / 100;
			System.out.println("For the distance traveled, the truck will consume: " + consumption + " liters of fuel.");
			
			break;
		}
		default:
			System.out.println("Invalid input. Please run the program again and enter existing type of vehicle."
					+ "\nVehicle to be entered is: MOTORCYCLE, CAR, VAN or TRACK.");
		
			break;
		}
		System.out.println("----------------------------------------");
		System.out.println("Thank you for using CONSUMPTION COUNTER.");
		System.out.println("----------------------------------------");
	}

}

