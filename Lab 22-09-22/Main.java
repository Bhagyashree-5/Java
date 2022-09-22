package mypack;

class Bank {
	 public void displayName()
	 {
		 System.out.println("This is bank name");
	 }
	 
	 public void displayLocation()
	 {
		 System.out.println("This is bank location");
	 }
}

class HDFC extends Bank {
	 public void displayName()
	 {
		 System.out.println("This is HDFC Bank");
	 }
	 
	 public void displayLocation()
	 {
		 System.out.println("This is located in Thane");
	 }
	 
}

class ICICI extends Bank {
	 public void displayName()
	 {
		 System.out.println("This is ICICI Bank");
	 }
	 
	 public void displayLocation()
	 {
		 System.out.println("This is located in Kalyan");
	 }
	 
}

public class Main {
	 public static void main(String[] args)
	 {
		 HDFC a1 = new HDFC();
		 a1.displayName();
		 a1.displayLocation();
		 
		 ICICI a2 = new ICICI();
		 a2.displayName();
		 a2.displayLocation();
	 }
}





