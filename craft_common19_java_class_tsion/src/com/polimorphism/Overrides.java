package com.polimorphism;

class Language {
	public void displayInfo() {
		System.out.println("Common English Language");
	}
}

class Java extends Language {
	@Override
	public void displayInfo() {
		System.out.println("Java Programming Language");
	}
}

public class Overrides {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create an object of Java class
		Java j1 = new Java();
		j1.displayInfo();

		// create an object of Language class
		Language l1 = new Language();
		l1.displayInfo();

	}

}
