package javaBasics;

public class PrintFunction {
	
	public static void main(String[] args) {
	String [] namesArray = {"Denny", "Finn", "Sophia", "John", "Olivia"};
	String [] lastNamesArray = {"Smith", "Jones", "Taylor", "Brown", "Wilson"};
	String [] facultiesArray = {"Law", "Fine Arts", "Human Kinetics", "Medicine", "Engineering"};
	double [] averageGradesArray = {8.21,9.0,7.47,9.75,7.95};
	int [] yearsOfBirthArray = {1987, 1990, 1988, 1986, 1992};

	for (int i = 0; i <=4; i++) {
		System.out.print(i + 1 + ") ");
		print(namesArray[i], lastNamesArray[i], facultiesArray[i], averageGradesArray[i], yearsOfBirthArray[i]);
	}
	
	}
	public static void print(String name, String lastName, String faculty, double averageMark, int yearOfBirth) {
		System.out.println("Student's name is: " + name + " " + lastName +". "+ "Student was born in " + yearOfBirth + ". " 
						+ name + " graduated from Faculty of " + faculty + " and obtained the average grade of " + averageMark + ".");
	}
}
