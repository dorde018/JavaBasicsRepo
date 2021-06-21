package javaBasics;

public class IfSumIs200{

	public static void main(String[] args) {
		int [] intArray = {12, 9, 3 ,5 ,6 ,28, 44, 16, 21, 87, 33, 15, 27, 48, 36, 78};
		int sum = 0;
		int counter = 1;
		
		for (int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
			if(sum < 200) {
			System.out.println(counter + ". element of the array is added. The current sum is: " + sum + ". Missing "+ (200-sum) + " to 200.");
			System.out.println("Sum total of elements of the array is less than 200.");
			counter++;
			}else if(sum == 200) {
			System.out.println("Sum total equals to 200.");
			break;
			}else if(sum > 200) {
			System.out.println("If we add "+ counter + ". element of the array that is " + intArray[i] + " to a current sum. Sum total will be greater than 200 for " + (sum - 200)+".");
			counter++;
		}
	}
	System.out.println("End of the program.");
		
	}

}
