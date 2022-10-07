package lab;

public class PersonMain {

	public static void main(String[] args) {
		Student stud = new Student(597, "Shuruti ", 86);
		Employee emp = new Employee(645, "Bhagyashree", 50000);
		System.out.println(stud.toString());
		System.out.println(emp.toString());

	}

}
