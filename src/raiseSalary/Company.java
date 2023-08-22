package raiseSalary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Company {
	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee>();

		Scanner sc = new Scanner(System.in);
		System.out.println("How many employees do you wish to add?");
		Integer numberOfEmployees = sc.nextInt();
		sc.nextLine();

		Integer i = 0;
		do {
			System.out.println("What's the employee id?");
			Integer id = sc.nextInt();
			sc.nextLine();
			Boolean idAlreadyExists = employees.stream().filter(employee -> employee.getId() == id).toList().size() > 0;
			if (idAlreadyExists) {
				System.out.println("The id field must be unique for each employee.");
			} else {
				System.out.println("What's the employee name?");
				String name = sc.nextLine();

				System.out.println("What's the employee salary");
				Double salary = sc.nextDouble();

				Employee employee = new Employee(id, name, salary);
				employees.add(employee);
				i++;
			}
		} while (i < numberOfEmployees);

		System.out.println("Provide the employee's which will earn a raise: ");
		Integer id = sc.nextInt();
		sc.nextLine();

		Boolean idDoesNotExist = employees.stream().filter(employee -> employee.getId() == id).toList().size() == 0;
		if (idDoesNotExist) {
			System.out.println("Invalid id, terminate opperation");
		} else {
			Employee employeeForRaise = employees.stream().filter(employee -> employee.getId() == id).findFirst()
					.orElse(null);

			System.out.println("What is the raise the employee will receive? (in %)");
			Double raise = sc.nextDouble();
			employeeForRaise.raise(raise);

			for (Employee employee : employees) {
				System.out.printf("ID: %d%n", employee.getId());
				System.out.printf("Name: %s%n", employee.getName());
				System.out.printf("Salary: $ %.2f%n%n", employee.getSalary());
			}
		}
		sc.close();

	}

}
