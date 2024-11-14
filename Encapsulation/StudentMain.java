package OOPS.Encapsulation;

public class StudentMain {

    public static void main(String[] args) {
        Student student = new Student();

        student.setAge(22);
        
        int age=student.getAge();
        System.out.println("Age: "+age);

        System.out.println("Age: "+student.getAge());
    }
    
}