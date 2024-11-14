package OOPS.Polymorphism.runtimepolymorphism;

public class Vehicle {
	
	void start() {
		System.err.println("Vehicle Stated");
	}
}

class Car extends Vehicle{
	
	@Override
	void start() {
		System.out.println("Car Started");
	}
}

class Bike extends Vehicle{
	
	@Override
	void start() {
		System.out.println("Bike Started");
	}
}
