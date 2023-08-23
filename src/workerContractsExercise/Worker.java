package workerContractsExercise;

import java.util.ArrayList;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	private ArrayList<HourContract> contracts;
	private Department department;
	
	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}
	
	public void addContract(HourContract contract) {
		this.contracts.add(contract);
	}
	public void removeContract(HourContract contract) {
		Integer contractIndex = contracts.indexOf(contract);
		this.contracts.remove(contractIndex);
	}
	
	public Double income() {
		Double contractEarnings = 0.0;
		for(int i = 0; i < this.contracts.size(); i++) {
			contractEarnings += this.contracts.get(i).totalValue();
		}
		return this.baseSalary + contractEarnings;
	}
	
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public WorkerLevel getWorkerLevel() {
		return this.level;
	}
	public void setWorkerLevel(WorkerLevel level) {
		this.level = level;
	}
	public Double getBaseSalary() {
		return this.baseSalary;
	}
	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public ArrayList<HourContract> getContracts(){
		return this.contracts;
	}
	public Department getDepartment() {
		return this.department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
}
