package lab;

public class CarMain {

	public static void main(String[] args) {
		Car c1 = new Bmw();
		Car c2 = new Hyundai();
		Car c3 = new Kia();
		
		
		c1.start();
		c1.mileage();
		if (c1 instanceof Car) {
			System.out.println(((Bmw) c1).name);
			((Bmw) c1).colour();
		}
		System.out.println();
		
		c2.start();
		c2.mileage();
		if (c2 instanceof Car) {
			System.out.println(((Hyundai) c2).name);
			((Hyundai) c2).colour();
		}
		System.out.println();
		
		c3.start();
		c3.mileage();
		if (c3 instanceof Car) {
			System.out.println(((Kia) c3).name);
			((Kia) c3).colour();
		}
		
	}

}
