package raiseSalary;

public class Employee {
	private Integer id;
	private String name;
	private Double salary;

	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void raise(Double increment) {
		this.salary = salary * (1 + increment / 100);
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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
}
