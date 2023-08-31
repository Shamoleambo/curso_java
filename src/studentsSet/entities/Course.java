package studentsSet.entities;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Course implements Comparable<Course> {
	private String name;
	private Set<Student> students = new HashSet<>();

	public Course(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Student> getStudents() {
		return students;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Course o) {
		return this.name.toUpperCase().compareTo(o.getName().toUpperCase());
	}


}
