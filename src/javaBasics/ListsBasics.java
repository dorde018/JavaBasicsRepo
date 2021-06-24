package javaBasics;

import java.util.ArrayList;

public class ListsBasics {

	public static void main(String[] args) {

	ArrayList<String> names = new ArrayList<String>();
	names.add("Dane");
	names.add("Martha");
	names.add("Sonny");
	names.add("Raquel");
	names.add(1, "Lammy");
	names.add(names.size(), "Ruth");
	int listSize = names.size();
	
	System.out.println("The length of the list is " + listSize);

	for (int i = 0; i < names.size(); i++) {
		System.out.println( i + 1 + ".name on the list is " + names.get(i) + ".");
	}
	System.out.println("We are out of the lsit and the last index of the list is name: " + names.get(names.size()-1) + ".");
	
	String [] addingMultipleElemenatsInTheList= {"Giovanna", "Hasel", "Michael", "Moore Clay", "Tonny", "Rose"};
		
		for (int i = 0; i < addingMultipleElemenatsInTheList.length; i++) {
			names.add(addingMultipleElemenatsInTheList[i]);
		}
		
		System.out.println("List after added names: " + names);
		System.out.println("Size of the list now is: " + names.size());
		System.out.println("I'm deleting 3rd index of the list. Deleted element with index 3 from the list is: " + names.remove(3) + ".");
		System.out.println("Size of the list now is: " + names.size());
		System.out.println("Names that are on the list now are: " + names );	
	}
}
