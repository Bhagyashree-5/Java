package lab;

public class MethodOverloading {
	public void area(int l, int w) {
		int result = l * w;
		System.out.println(result);
	}
	
	public void area(double l, double w) {
		double result = l * w;
		System.out.println(result);
	}

	public static void main(String[] args) {
		MethodOverloading meth = new MethodOverloading();
		meth.area(4, 8);
		meth.area(8.3, 5.4);
	}

}
