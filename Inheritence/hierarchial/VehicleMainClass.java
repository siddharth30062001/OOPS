package OOPS.Inheritence.hierarchial;

class VehicleMainClass {
    

    public static void main(String[] args) {

        Bike bike = new Bike();
        Car car = new Car();
        System.out.println(car.brand);
        System.out.println(car.color);
        car.Drive();

        System.out.println("--------");

        System.out.println(bike.brand);
        System.out.println(bike.cost+" Lakhs");
        bike.Ride();
        
    }
    
}