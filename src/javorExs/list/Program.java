package javorExs.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		System.out.println("Inform number of employees to be registered");
		Scanner sc = new Scanner(System.in);
		int numberOfEmployees = sc.nextInt();
		sc.nextLine();

		List<Employee> employees = new ArrayList<Employee>();
		for (int i = 0; i < numberOfEmployees; i++) {
			System.out.printf("Please inform the %d° unique id:%n", i + 1);
			int id = sc.nextInt();
			sc.nextLine();
			Employee employeeAlreadyExists = employees.stream().filter(employee -> employee.getId() == id).findFirst()
					.orElse(null);
			if (employeeAlreadyExists != null) {
				System.out.println("Invalid id!");
				break;
			}

			System.out.println("Please inform the employee's name:");
			String name = sc.nextLine();

			System.out.println("Please inform the employee's salary:");
			Double salary = sc.nextDouble();
			sc.nextLine();

			employees.add(new Employee(id, name, salary));
		}

		System.out.println(employees);

		System.out.println("What's the employee's id to give raise:");
		int id = sc.nextInt();
		sc.nextLine();
		Employee employeeToReceiveRaise = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(employeeToReceiveRaise != null) {
			System.out.println("Provide the amount to be raised in percentage:");
			double raiseAmount = sc.nextDouble();
			employeeToReceiveRaise.raiseSalary(raiseAmount);
			System.out.println(employees);
		}else {
			System.out.println("Invalid id!");
		}
		sc.close();
	}

}
