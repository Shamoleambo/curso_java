package javorExs.list;

public class Employee {
	private Integer id;
	private String name;
	private Double salary;

	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void raiseSalary(Double percentAmount) {
		double decimalAmount = percentAmount / 100;
		this.salary *= (1 + decimalAmount);
	}

	public Integer getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String newName) {
		this.name = newName;
	}

	public Double getSalary() {
		return this.salary;
	}
	
	public String toString() {
		return "ID: " + this.id + "; Name: " + this.name + "; Salary: $ " + this.salary;
	}
}
