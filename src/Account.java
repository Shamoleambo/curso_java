public class Account {
	private String holder;
	private Integer ID;
	protected Double balance;

	public Account() {

	}

	public Account(String holder, Integer id, Double initialDeposit) {
		this.holder = holder;
		this.ID = id;
		this.balance = initialDeposit;
	}

	public void withdraw(Double amount) {
		this.balance -= (amount + 5);
	}

	public void deposit(Double amount) {
		this.balance += amount;
	}

	public String getHolder() {
		return this.holder;
	}

	public void setHodler(String holder) {
		this.holder = holder;
	}

	public Integer getID() {
		return this.ID;
	}

	public Double getBalance() {
		return this.balance;
	}
}