import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int x=sc.nextInt();
		int y=sc.nextInt();
		sc.close();

		Calculator cl=new CalculatorImpl();
		cl.add(x,y);
		cl.mul(x, y);
	}
}
