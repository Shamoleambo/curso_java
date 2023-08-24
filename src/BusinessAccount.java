public class BusinessAccount extends Account {
	private Double loanLimit;

	public BusinessAccount(String holder, Integer id, Double initialDeposit, Double loanLimit) {
		super(holder, id, initialDeposit);
		this.loanLimit = loanLimit;
	}

	public void loan(Double amount) {
		if (amount < this.loanLimit) {
			this.balance += amount;
		}
	}

	public Double getLoanLimit() {
		return this.loanLimit;
	}
}