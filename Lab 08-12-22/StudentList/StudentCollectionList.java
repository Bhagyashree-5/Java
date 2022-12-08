package labcodes;

import java.util.ArrayList;

public class StudentCollectionList {

	public String student(int index) {
		ArrayList<String> students = new ArrayList<String>();
		students.add("Bhagyashree");
		students.add("Ashutosh");
		students.add("Rupam");
		return students.get(index);
	}

}
