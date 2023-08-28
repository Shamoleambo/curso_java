
public final class SavingsAccount extends Account {
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}
	
	public SavingsAccount(String holder, Integer ID, Double initialDeposit, Double interestRate) {
		super(holder, ID, initialDeposit);
		this.interestRate = interestRate;
	}
	
	public void update() {
		this.balance += this.balance * interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	
}
