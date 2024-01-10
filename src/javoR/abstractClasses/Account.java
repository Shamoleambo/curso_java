package javoR.abstractClasses;

public abstract class Account {

	private String name;
	private Integer number;
	private Double amount;

	public Account(String name, Integer number, Double amount) {
		this.name = name;
		this.number = number;
		this.amount = amount;
	}
	
	public void withdraw(Double amount) {
		this.amount -= amount;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumber() {
		return this.number;
	}

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

}
