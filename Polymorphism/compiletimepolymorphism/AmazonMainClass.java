package OOPS.Polymorphism.compiletimepolymorphism;

public class AmazonMainClass {

	public static void main(String[] args) {

		Amazon amazon = new Amazon();

		amazon.buy("Mobile",40000);
		amazon.buy("Laptop");
		amazon.buy(60000);
		amazon.buy(20000,"Watch");
	}

}
