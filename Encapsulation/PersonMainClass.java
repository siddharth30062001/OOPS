package OOPS.Encapsulation;

import java.util.Scanner;

public class PersonMainClass {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Age:");
        int a=scanner.nextInt();
        scanner.close();

        Person person=new Person();
        person.setAge(a);

        System.out.println("------------");
        System.out.println("Age: "+person.getAge());
    }
    
}