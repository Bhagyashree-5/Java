
class mother {
	void display1() {
		System.out.println("Eating");
	}

}

class cat extends mother {
	void display2() {
		System.out.println("Meow");
	}

}

class babycat extends cat {
	void display3() {
		System.out.println("Crying");
	}

}

class kitty extends babycat {
	void display4() {
		System.out.println("My name is kitty");
	}

}

class dream extends babycat {
	void display5() {
		System.out.println("My name is dream");
	}

}


public class Animal {
	public static void main(String[] args) {
		kitty kt = new kitty();
		kt.display1();  
		kt.display2();
		kt.display3();
		kt.display4();
		
		dream dr = new dream();
		dr.display1();
		dr.display2();
		dr.display3();
		dr.display5();
		
	}
}