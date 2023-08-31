package studentsSet.entities;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Teacher {
	private final Set<Course> COURSES = new TreeSet<>(Arrays.asList(new Course("A"), new Course("B"), new Course("C")));

	public Set<Student> getAllStudents() {
		Set<Student> allStudents = new HashSet<Student>();
		for (Course course : this.COURSES) {
			allStudents.addAll(course.getStudents());
		}

		return allStudents;
	}

	public Set<Course> getCOURSES() {
		return COURSES;
	}

}
