//package com.exersicethree;

class cars {

//  variables
	private boolean engine;
	private int cylinders;
	private String name;
	private int wheels;

	public void Car(int wheel, String bloon) {
		// TODO Auto-generated constructor stub
	}

	// constructor
	public void car(int cylinders, String name) {
		this.cylinders = cylinders;
		this.name = name;
		this.wheels = 4;
		this.engine = true;

	}

	public String startEngine() {
		return "car = startEngine()";

	}

	public String accelerate() {
		return "car = accelerate()";

	}

	public String brake() {
		return "car = brake()";
	}

	public int getCylinders() {
		return cylinders;
	}

	public String getName() {
		return name;
	}
}

class Toyota extends Car {
	public Toyota(int cylinders, String name) {
		super(cylinders, name);
	}

	@Override

	public String startEngine() {
		return "Toyota = startEngine()";
	}

	@Override
	public String accelerate() {
		return "Toyota = accelerate()";
	}

	@Override
	public String brake() {
		return "Toyota = brake()";
	}
}

class Ford extends Car {
	public Ford(int cylinders, String name) {
		super(cylinders, name);
	}

	@Override

	public String startEngine() {
		return "Ford = startEngine()";
	}

	@Override
	public String accelerate() {
		return "Ford = accelerate()";
	}

	@Override
	public String brake() {
		return "Ford = brake()";
	}
}

class Audi extends Car {
	public Audi(int cylinders, String name) {
		super(cylinders, name);
	}

	@Override

	public String startEngine() {
		return "Audi = startEngine()";
	}

	@Override
	public String accelerate() {
		return "Audi = accelerate()";
	}

	@Override
	public String brake() {
		return "Audi = brake()";
	}

}

public class MainCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		 create an object of car 

		Car T1 = new Car(8, "Base Car");
		System.out.println(T1.startEngine());
		System.out.println(T1.accelerate());
		System.out.println(T1.brake());

//		 create an object of Toyota car 
		
		Toyota m2 = new Toyota(4, "Explorer");
		System.out.println(m2.startEngine());
		System.out.println(m2.accelerate());
		System.out.println(m2.brake());

//		 create an object of Ford car
		Ford m1 = new Ford(8, "Explorer");
		System.out.println(m1.startEngine());
		System.out.println(m1.accelerate());
		System.out.println(m1.brake());
		
//		 create an object of Audi car
		
		Audi n2 = new Audi(6, "Explorer");
		System.out.println(n2.startEngine());
		System.out.println(n2.accelerate());
		System.out.println(n2.brake());
	}

}
