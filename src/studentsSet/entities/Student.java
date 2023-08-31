package studentsSet.entities;

import java.util.Objects;

public class Student  {
	private Integer numberID;
	
	public Student(Integer numberID) {
		this.numberID = numberID;
	}

	public Integer getNumberID() {
		return numberID;
	}

	public void setNumberID(Integer numberID) {
		this.numberID = numberID;
	}
	
	

	@Override
	public String toString() {
		return "Student [numberID=" + numberID + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(numberID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(numberID, other.numberID);
	}
	
	
}
