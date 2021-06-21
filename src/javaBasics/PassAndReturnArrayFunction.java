package javaBasics;


public class PassAndReturnArrayFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int [] intArray = {2, 5, 6, 7, 8, 10, 12, 13, 15, 23, 44, 34, 84, 28, 99, 101, 72, 49};
		System.out.println("Elements of an array divisible by 3 are: ");
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i]%3==0) {
			System.out.println(intArray[i] + " ");
						
			}
		}
		
	int[] array= {2, 5, 7, 9, 15, 33, 44, 65, 58, 18, 34, 93, 109, 245, 88};
		System.out.println("Elements of an array divisble by 3 are: ");
		int[] returnedFromFunction= returnIntArrayDivisibleBy3(array);
		for (int i = 0; i < returnedFromFunction.length; i++) {
			System.out.println(returnedFromFunction[i]);
					
		}
	}
				
	public static int [] returnIntArrayDivisibleBy3(int[] passedArray) {
		int[] intArrayDivisibleBy3;
		int counter=0;
		for (int i = 0; i < passedArray.length; i++) {
				if (passedArray[i]%3==0) {
					 counter+=1;
			}
		}
		
		intArrayDivisibleBy3=new int[counter];
		int index=0;
		for (int i = 0; i < passedArray.length; i++) {
			if(passedArray[i]%3==0) {
				intArrayDivisibleBy3[index]= passedArray[i];
				index+=1;
					
			}
				
		}
			return intArrayDivisibleBy3;
}

}

