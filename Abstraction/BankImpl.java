class BankImpl implements Bank {

	int balance=5000;

	public void deposit (int amount) {
		System.out.println("Depositing ₹"+amount);
		balance+=amount;
		System.out.println("Amount succesfully deposited");
	}

	public void withdraw(int amount) {
		System.out.println("-----");
		System.out.println("Withdrawing ₹"+amount);
		balance-=amount;
		System.out.println("Amount succesfully withdrawed");
	}

	public void checkBalance() {
		System.out.println("-----");
		System.out.println("Available Balance ₹"+balance);
	}

}
