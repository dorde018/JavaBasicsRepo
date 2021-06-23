package javaBasics;

public class IncreaseTheElementOfTheArrayForItsOwnIndexPosition {

	public static void main(String[] args) {
		int [] intArray = {1, 5, 7, -1, 4, 6, 9, 10, 23, 19, 33, -6};
	
		for ( int i= 0; i < intArray.length; i++) {
				intArray[i] = intArray[i]+i;
			
				if (i< intArray.length-1) {
				System.out.print(intArray[i]+", ");
				}else {
				System.out.println(intArray[i]);
			}
		}
	}
}
