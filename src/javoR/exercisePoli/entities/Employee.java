package javoR.exercisePoli.entities;

import javoR.exercisePoli.entities.enums.Department;

public class Employee {
	private String name;
	private Integer hours;
	private Double valuePerHour;
	private Department department;

	public Employee(String name, Integer hours, Double valuePerHour, Department management) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
		this.department = management;
	}

	public Double payment() {
		return hours * valuePerHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String toString() {
		return this.name + " - $ " + payment();
	}

}
