package oopBank;

public class BankAccount {
	public static final double WITHDRAWAL_FEE = 5;
	private final int ACCOUNT_NUMBER;
	private String accountOwner;
	private double balance;

	public BankAccount(int accountNumber, String accountOwner) {
		this.ACCOUNT_NUMBER = accountNumber;
		this.accountOwner = accountOwner;
	}

	public BankAccount(int accountNumber, String accountOwner, double initialDeposit) {
		this.ACCOUNT_NUMBER = accountNumber;
		this.accountOwner = accountOwner;
		this.balance = initialDeposit;
	}

	public void deposit(double amount) {
		this.balance += amount;
		System.out.println(this.toString());
	}

	public void withdraw(double amount) {
		this.balance -= (amount + WITHDRAWAL_FEE);
		System.out.println(this.toString());
	}

	public String toString() {
		String accountBalance = String.format("$ %.2f", this.balance);
		return String.format("Account number: %d%nBalance: %s", this.ACCOUNT_NUMBER, this.balance);
	}

	public String getAccountOwner() {
		return this.accountOwner;
	}

	public void setAccountOwner(String name) {
		this.accountOwner = name;
	}
}
