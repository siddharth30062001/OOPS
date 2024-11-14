package OOPS.Inheritence.multilevel;

public class MainClass {
    public static void main(String[] args) {

        Department department = new Department();
        System.out.println(department.universityName);
        department.ConductExams();
        System.out.println("-------");
        System.out.println(department.collegeName);
        department.conductInternals();
        System.out.println("--------");
        System.out.println(department.departmentName);
        department.giveAssignments();
    }

}
