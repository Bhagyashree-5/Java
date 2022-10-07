package lab;

public class Bmw extends Car {
	String name = "Bmw";
	int top_speed = 600;
	int no_of_doors = 2;
	boolean sun_roof = true;

	@Override
	void mileage() {
		System.out.println("Bmw has mileage of 15 km");
	}

	@Override
	void speed() {
		System.out.println("Car is on low speed");
	}
	
	void colour() {
		System.out.println("It is white in colour");
	}

}
