package exercises.employee;

public class Employee {

	private String name;
	private double grossSalary;
	private double tax;

	public Employee(String name, double grossSalary, double tax) {
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}

	public double netSalary() {
		return this.grossSalary - this.tax;
	}

	public void increaseSalary(double percentage) {
		setGrossSalary(this.grossSalary * (1 + percentage / 100));
	}

	public String getName() {
		return this.name;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public String toString() {
		return "Employee: " + getName() + ", $ " + netSalary();
	}
}
