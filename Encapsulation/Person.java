package OOPS.Encapsulation;

public class Person {

    private int age;

    public void setAge(int age){
        
        if(age>0){
            this.age=age;
            System.out.println("Age Initialized Successfully!");
        }
        else{
            System.out.println("Invalid Age!!!");
        }
    }

    public int getAge(){
        return age;
    }
    
}