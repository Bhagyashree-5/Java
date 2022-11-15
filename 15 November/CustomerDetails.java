package tasks;
	
import java.util.ArrayList;

public class CustomerDetails {
	public static void main(String[] args) {
		ArrayList<Customer> bank = new ArrayList<>();
		bank.add(new Customer(6748, "Bhagyashree", 79000));
		bank.add(new Customer(8754, "Ashutosh", 74000));
		bank.add(new Customer(4685, "Vikas", 87000));
		bank.add(new Customer(4657, "Pratham", 67000));
		bank.add(new Customer(9845, "Rupam", 69000));
		
		// getting all customers detail using toString method
		System.out.println(bank);
	}

}
