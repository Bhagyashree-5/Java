package lab;

public class BankMain {
	public static void main(String[] args) {
		Sbi sbi = new Sbi();
		sbi.interest();
		
		Axis axis = new Axis();
		axis.interest();
		
		Icici icici = new Icici();
		icici.interest();
	}

}
