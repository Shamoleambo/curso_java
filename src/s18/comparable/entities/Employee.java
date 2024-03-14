package s18.comparable.entities;

public class Employee implements Comparable<Employee>{

	private String name;
	private Double salary;

	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return this.salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		return -this.salary.compareTo(o.getSalary());
	}
	
	@Override
	public String toString() {
		return this.name + " $" + this.salary;
	}
}
