package OOPS.Encapsulation;

import java.util.Scanner;

public class EmployeeMainClass {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Id:");
        int i = scanner.nextInt();
        System.out.println("Enter the Name:");
        String n=scanner.next();
        System.out.println("Enter the Salary:");
        int s=scanner.nextInt();
        System.out.println("----------");
        scanner.close();

        Employee employee=new Employee();

        employee.setId(i);
        employee.setName(n);
        employee.setSalary(s);

        System.out.println("Id: "+employee.getId());
        System.out.println("Name: "+employee.getName());
        System.out.println("Salary: "+employee.getSalary());
    }
    
}