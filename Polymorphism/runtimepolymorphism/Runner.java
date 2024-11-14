package OOPS.Polymorphism.runtimepolymorphism;

public class Runner {

	static void display(Vehicle obj) {
		obj.start();
	}

	public static void main(String[] args) {

		Vehicle vehicle;
		vehicle=new Car();
		vehicle.start();
		vehicle=new Bike();
		vehicle.start();

		System.out.println("-----------");

		Vehicle v1=new Car();
		v1.start();
		Vehicle v2=new Bike();
		v2.start();

		System.out.println("------------");

		display(new Car());
		display(new Bike());
	}

}
