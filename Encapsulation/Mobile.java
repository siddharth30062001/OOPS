package OOPS.Encapsulation;

public class Mobile {

    private String brand;
    private int cost;

    public void setBrand(String brand){
        this.brand=brand;
    }

    public void setCost(int cost){
        this.cost=cost;
    }

    public String getBrand(){
        return brand;
    }

    public int getCost(){
        return cost;
    }
    
}