package project.faculty.domain;

import java.util.List;

public class Faculty {
	
	private Integer id;
	private FacultyName facultyName;
	private Integer numberOfStudent;
	private List<Subject> subject;
	
	public Faculty() {super();
	}

	public Faculty(FacultyName facultyName, Integer numberOfStudent, List<Subject> subject) {
		this.facultyName = facultyName;
		this.numberOfStudent = numberOfStudent;
		this.subject = subject;
	}

	public Faculty(Integer id, FacultyName facultyName, Integer numberOfStudent, List<Subject> subject) {
		this.id = id;
		this.facultyName = facultyName;
		this.numberOfStudent = numberOfStudent;
		this.subject = subject;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public FacultyName getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(FacultyName facultyName) {
		this.facultyName = facultyName;
	}

	public Integer getNumberOfStudent() {
		return numberOfStudent;
	}

	public void setNumberOfStudent(Integer numberOfStudent) {
		this.numberOfStudent = numberOfStudent;
	}

	public List<Subject> getSubject() {
		return subject;
	}

	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((facultyName == null) ? 0 : facultyName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((numberOfStudent == null) ? 0 : numberOfStudent.hashCode());
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Faculty other = (Faculty) obj;
		if (facultyName != other.facultyName)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (numberOfStudent == null) {
			if (other.numberOfStudent != null)
				return false;
		} else if (!numberOfStudent.equals(other.numberOfStudent))
			return false;
		if (subject == null) {
			if (other.subject != null)
				return false;
		} else if (!subject.equals(other.subject))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Faculty [id=" + id + ", facultyName=" + facultyName + ", numberOfStudent=" + numberOfStudent
				+ ", subject=" + subject + "]";
	}

}
