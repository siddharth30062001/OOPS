package OOPS.Polymorphism.runtimepolymorphism;

public class MainClass {

	static void display(Employee obj) {
		obj.work();
	}

	public static void main(String[] args) {

		Employee employee1 = new Developer();//1st way of achieving Upcasting
		employee1.work();

		Employee employee2 = new Tester();
		employee2.work();

		System.out.println("---------------");

		Employee emp;//2nd way of achieving Upcasting

		emp = new Developer();
		emp.work();
		emp = new Tester();
		emp.work();

		System.out.println("---------------");

		display(new Developer());//3rd way of achieving Upcasting
		display(new Tester()); 
	}

}
