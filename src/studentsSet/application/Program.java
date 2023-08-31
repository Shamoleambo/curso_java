package studentsSet.application;

import java.util.Scanner;

import studentsSet.entities.Course;
import studentsSet.entities.Student;
import studentsSet.entities.Teacher;

public class Program {

	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		Scanner sc = new Scanner(System.in);
		
		for(Course course: teacher.getCOURSES()) {
			System.out.printf("How many students in course %s? ", course.getName());
			Integer amountOfStudentsToInsert = sc.nextInt();
			sc.nextLine();
			
			
			for(int i = 0; i< amountOfStudentsToInsert; i++) {
				Integer studentId = sc.nextInt();
				sc.nextLine();
				
				course.getStudents().add(new Student(studentId));
			}
		}
		
		Integer numberOfStudent = 0;
		for(Student std: teacher.getAllStudents()) {
			numberOfStudent++;
		}
		
		System.out.printf("Number of students: %d", numberOfStudent);
		sc.close();
	}

}
