package javaBasics;

public class PrimitveArrays {

	public static void main(String[] args) {
		
		String [] daysOfTheWeek = new String [7];
		daysOfTheWeek [0] = "Monday";
		daysOfTheWeek [1] = "Tuesday";
		daysOfTheWeek [2] = "Wednesday";
		daysOfTheWeek [3] = "Thursday";
		daysOfTheWeek [4] = "Friday";
		daysOfTheWeek [5] = "Saturday";
		daysOfTheWeek [6] = "Sunday";
		
		for (int i = 0; i < daysOfTheWeek.length; i++)  {
			System.out.println((i+1) + ". day of the week is: " + daysOfTheWeek[i] + ".");
		}
		System.out.println("----------------------------------");
		System.out.println("The another way");
		System.out.println("----------------------------------");
		
		String[] daysOfTheWeek2 = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		
		for (int i = 0; i < daysOfTheWeek.length; i++) {
			System.out.println((i+1) + ". day of the week is: " + daysOfTheWeek2[i]);
		}
		
		
		System.out.println("----------------------------------");
		System.out.println("Arithmetic mean");
		System.out.println("----------------------------------");
		
		int[] intArray = {14, 32, 24, 6, 38, 10, 12, 123, 1, -13, 44};
		int sum = 0;
		int arithmeticMean=0;
		for (int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
		}
		arithmeticMean = sum / intArray.length;
		System.out.println("The arithmetic mean of the numbers of the array is: " + arithmeticMean);
		
		
		System.out.println("----------------------------------");
		System.out.println("Minimum number of the array");
		System.out.println("----------------------------------");
		
		int[] integerArray = {18, 3, 34, 4, 1, 5, 67, 4, 55, 17, 23};
		int min = integerArray[0];
		for (int i = 0; i < integerArray.length; i++)
			if (integerArray [i] < min) {
				min = integerArray[i];
			}
		System.out.println("The minimum number of the array is: " + min);
	}
	
}
