package lab;

public abstract class Car {
 int no_of_tires = 4;
	
	public void start() {
		System.out.println("Car has it's Engine...");
	}
	
	abstract void colour();
	
	abstract void mileage();
	
	public void speed() {
		System.out.println("Car is on high speed");
	}

}
