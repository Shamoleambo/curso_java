package javoR.exercisePoli;

import java.util.ArrayList;
import java.util.List;

import javoR.exercisePoli.entities.Employee;
import javoR.exercisePoli.entities.OutsorcedEmployee;
import javoR.exercisePoli.entities.enums.Department;

public class Program {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Mano", 8, 60.0, Department.MANAGEMENT);
		Employee emp2 = new Employee("Truta", 8, 45.0, Department.IT);
		OutsorcedEmployee oemp = new OutsorcedEmployee("Diana Trabalhadora", 2, 23.50, 10.0, Department.HR);
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(oemp);
		
		System.out.println(employees);
	}

}
