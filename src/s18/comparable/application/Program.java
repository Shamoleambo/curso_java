package s18.comparable.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import s18.comparable.entities.Employee;

public class Program {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		String path = "c:\\users\\tidgo\\documentos\\test.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String employeeCsv = br.readLine();
			while (employeeCsv != null) {
				String[] fieldsCsv = employeeCsv.split(","); 
				list.add(new Employee(fieldsCsv[0], Double.parseDouble(fieldsCsv[1])));
				employeeCsv = br.readLine();
			}
			Collections.sort(list);
			for(Employee e: list) {
				System.out.println(e);
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
