package lab;

import java.util.*;

public class StudentDetails {
	public static void main(String[] args) {
		ArrayList<String> arrlist = new ArrayList<String>();
		// Adding student name
		arrlist.add("Vandana");
		arrlist.add("Sneha");
		arrlist.add("Manasi");
		arrlist.add("Rafat");
		arrlist.add("Aman");
		arrlist.add("Raj");
		
		ListIterator<String> stud = arrlist.listIterator();
		
		// Printing student name in forward direction
		while(stud.hasNext()) {
			System.out.println(stud.next());
		}
		System.out.println();
		
		// Printing student name in backward direction
		while(stud.hasPrevious()) {
			System.out.println(stud.previous());
		}
	}
}
	

