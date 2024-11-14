package OOPS.Polymorphism.runtimepolymorphism;

public class Employee {

	void work() {
		System.out.println("Employee is Working");
	}
}

class Developer extends Employee{

	@Override
	void work() {
		System.out.println("Developing App!!");
	}
}

class Tester extends Employee {

	@Override
	void work() {
		System.out.println("Testing App!!");
	}
}