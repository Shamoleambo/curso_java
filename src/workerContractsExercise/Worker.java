package workerContractsExercise;

import java.util.ArrayList;
import java.util.List;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	private List<HourContract> contracts = new ArrayList<HourContract>();
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
	
	public Double income(Integer year, Integer month) {
		Double contractEarnings = 0.0;
		for(int i = 0; i < this.contracts.size(); i++) {
			HourContract contract = this.contracts.get(i);
			
			Boolean isFromRequestedMonth = contract.getDate().getMonthValue() == month;
			Boolean isFromRequestedYear = contract.getDate().getYear() == year;
			if(isFromRequestedMonth && isFromRequestedYear) {
				contractEarnings += this.contracts.get(i).totalValue();
			}
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
	public List<HourContract> getContracts(){
		return this.contracts;
	}
	public Department getDepartment() {
		return this.department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
}
