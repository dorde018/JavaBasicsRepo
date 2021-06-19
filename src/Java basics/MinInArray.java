package java;

public class MinInArray {

	public static void main(String[] args) {
		int [] intArr= {3, 5, 4, 11, -1, 23, 5, 43, 0, 14, 77, -6, 134, -21, 18};
		
		int minOfArray=minOfArray(intArr);
		System.out.println(minOfArray);		
	}

	public static int minOfArray(int[] intArray) {
		int min = intArray[0];
		for (int i = 0; i < intArray.length; i++) {
			if(intArray[i]<min) {
				min = intArray[i];
			}
		}
		return min;
	}
}
