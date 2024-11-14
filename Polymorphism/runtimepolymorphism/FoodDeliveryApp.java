package OOPS.Polymorphism.runtimepolymorphism;

public class FoodDeliveryApp {
	
	void orderFood() {
		System.out.println("Ordering Food!");
	}

}

class Swiggy extends FoodDeliveryApp{
	
	void orderFood() {
		System.out.println("Ordering Pizza from Swiggy");
	}
}

class Zomato extends FoodDeliveryApp{
	
	void orderFood() {
		System.out.println("Ordering Burger from Zomato");
	}
}
