package exercises.bankAccount;

public class Account {
	private final int WITHDRAW_FEE = 5;
	private int number;
	private String owner;
	private double balance;

	public Account(int number, String owner) {
		this.number = number;
		this.owner = owner;
	}

	public Account(int number, String owner, double initialDeposit) {
		this.number = number;
		this.owner = owner;
		this.balance = initialDeposit;
	}

	public void printAccountInfoAndDeposit(double amount) {
		deposit(amount);
		printAccountInfo();
	}
	
	public void printAccountInfoAndWithdraw(double amount) {
		withdraw(amount);
		printAccountInfo();
	}

	private void printAccountInfo() {
		System.out.println(this.toString());
	}

	private void deposit(double amount) {
		this.balance += amount;
	}
	
	private void withdraw(double amount) {
		this.balance -= (amount + WITHDRAW_FEE);
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String newName) {
		this.owner = newName;
	}

	public int getNumber() {
		return this.number;
	}

	public double getBalance() {
		return this.balance;
	}

	public String toString() {
		return "Account number: " + this.number + "; Owner: " + this.owner + "; Balance: $ " + this.balance;
	}

}
