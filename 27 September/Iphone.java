package com.java;

public class Iphone extends Phone {
	
	@Override
	public void storage() {
		System.out.println("Iphone will have storage up to 512GB");
		
	}

	@Override
	public void battery() {
		System.out.println("Battery life is 15 hours");
		
	}

	@Override
	public void displaysize() {
		System.out.println("Display size is 6.1 inches");
	}

}
