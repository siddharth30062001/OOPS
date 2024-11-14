import java.util.Scanner;

class BankMainClass {
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Depositing amount");
		int d=scanner.nextInt();
		System.out.println("Enter the Withdrawing amount");
		int w=scanner.nextInt();
		scanner.close();

		Bank b=new BankImpl();
		b.deposit(d);
		b.withdraw(w);
		b.checkBalance();
	}
}
