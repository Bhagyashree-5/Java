package lab;

public class Hyundai extends Car{
	String name = "Hyundai";
	int top_speed = 230;
	int no_of_doors = 2;
	boolean sun_roof = false;

	@Override
	void mileage() {
		System.out.println("Hyundai has mileage of 12 km");
	}

	@Override
	void speed() {
		System.out.println("Car is on high speed");
	}
	
	void colour() {
		System.out.println("It is blue in colour");
	}

}
