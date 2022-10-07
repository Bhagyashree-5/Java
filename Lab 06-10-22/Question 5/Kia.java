package lab;

public class Kia extends Car {
	String name = "Kia";
	int top_speed = 270;
	int no_of_doors = 2;
	boolean sun_roof = true;

	@Override
	void mileage() {
		System.out.println("Kia has mileage of 10 km");
	}

	@Override
	void speed() {
		System.out.println("Car is on average speed");
	}
	
	void colour() {
		System.out.println("It is black in colour.");
	}

}
