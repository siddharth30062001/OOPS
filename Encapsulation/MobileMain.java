package OOPS.Encapsulation;

public class MobileMain {

    public static void main(String[] args) {
        Mobile mobile = new Mobile();

        mobile.setBrand("Realme");
        mobile.setCost(28000);

        System.out.println("Brand: "+mobile.getBrand());
        System.out.println("Cost: "+mobile.getCost());
    }
    
}