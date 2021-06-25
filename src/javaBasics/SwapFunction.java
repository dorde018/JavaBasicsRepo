package javaBasics;

public class SwapFunction{

	public static void main(String[] args) {
	
		boolean swap = false;
		
		String printStrings = swap("First String", "Second String", swap);
	
			if (swap) {
				System.out.println("The strings are reversed: "  +  printStrings + ".");}
			
			else {
				System.out.println("The strings are not reversed: "  +  printStrings + ".");}
	}
	
	public static String swap(String firstStr, String secondStr, boolean swap) {   
		String print = "";
		if (swap == false) {print = firstStr + " & " +  secondStr;}
		
		else {print = secondStr + " & " +  firstStr;}
		return print;
	
		
	}
}

