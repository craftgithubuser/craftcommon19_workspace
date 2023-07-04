package com.polimorphism;

class Polygon {

	// method to render a shape
	public void render() {
		System.out.println("Rendering Polygon...");
	}
}

class Square extends Polygon {

	// renders Square
	public void render() {
		System.out.println("Rendering Square...");
	}
}

class Circle extends Polygon {

	// renders circle
	public void render() {
		System.out.println("Rendering Circle...");
	}
}

public class PolimorphismMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create an object of Square
		Square t1 = new Square();
		t1.render();

		// create an object of Circle
		Circle f1 = new Circle();
		f1.render();
	}

}
