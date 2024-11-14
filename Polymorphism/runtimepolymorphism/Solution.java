package OOPS.Polymorphism.runtimepolymorphism;

public class Solution {
	
	static void display(FoodDeliveryApp obj) {
		obj.orderFood();
	}
	
	public static void main(String[] args) {
		
		FoodDeliveryApp foodDeliveryApp;
		foodDeliveryApp=new Swiggy();
		foodDeliveryApp.orderFood();
		foodDeliveryApp=new Zomato();
		foodDeliveryApp.orderFood();
		
		System.out.println("-----");
		
		FoodDeliveryApp f1=new Swiggy();
		f1.orderFood();
		FoodDeliveryApp f2=new Zomato();
		f2.orderFood();
		
		System.out.println("-----");
		
		display(new Swiggy());
		display(new Zomato());
	}

}
