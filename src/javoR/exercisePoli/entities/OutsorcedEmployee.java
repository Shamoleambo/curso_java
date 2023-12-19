package javoR.exercisePoli.entities;

import workerContractsExercise.Department;

public class OutsorcedEmployee extends Employee {
	public Double additionalCharge;

	public OutsorcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge,
			Department department) {
		super(name, hours, valuePerHour, department);
		this.additionalCharge = additionalCharge;
	}

	@Override
	public Double payment() {
		return super.payment() + 1.1 * additionalCharge;
	}

}
