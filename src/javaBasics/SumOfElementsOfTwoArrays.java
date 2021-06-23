package javaBasics;

public class SumOfElementsOfTwoArrays  {
	public static void main(String[] args) {
		
		int [] firstIntegerArray = {2, 5, 6, 4, 3, 5, 13, 9, 29, 34, 8, 17};
		int [] secondIntegerArray = {3, 4, 6, 4, 2, 4, 23, 113, 13, 21, 5, 14};
		
		int sumOfTheElementsOfTheFirstArray = sumOfTheELementsOfTheArray(firstIntegerArray);
		System.out.println("The sum of the elements of the first array is: " + sumOfTheElementsOfTheFirstArray + ".");
		
		int sumOfTheElementsOfTheSecondArray = sumOfTheELementsOfTheArray(secondIntegerArray);
		System.out.println("The sum of the elements of the second array is: " + sumOfTheElementsOfTheSecondArray + ".");
		
		int sumOfTheElementsOfTwoArrays = sumOfTheElementsOfTwoArrays(firstIntegerArray, secondIntegerArray);
		System.out.println("The sum of the elements of the first and the second array is: " + sumOfTheElementsOfTwoArrays + ".");
	}
	public static int sumOfTheELementsOfTheArray(int [] integerArray) {
		int sum = 0;
		for (int i = 0; i < integerArray.length; i++) {
			sum = sum + integerArray[i];
		}
		return sum;
	}
	public static int sumOfTheElementsOfTwoArrays(int [] firstArray, int [] secondArray) {
		int sum = 0;
		for (int i = 0; i < firstArray.length; i++) {
			sum += firstArray[i];
		}
		for (int i = 0; i < secondArray.length; i++) {
			sum += secondArray[i];
		}
		return sum;
	}
}

