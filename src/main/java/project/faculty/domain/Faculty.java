package project.faculty.domain;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "faculty")
public class Faculty<numberOfStudent> {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column
	private String name;
	
	@Column
	private Integer numberOfStudent;
	
	@ElementCollection(targetClass = Subjects.class)
	@CollectionTable(name="Subjects", joinColumns = @JoinColumn(name="FACULTY_ID") ) 
	@Column( name="Subjects", nullable=false ) 
	private List<Subjects> subjects;

	public Faculty() {
		super();
	}

	public Faculty(String name, Integer numberOfStudent, List<Subjects> subjects) {
		super();
		this.name = name;
		this.numberOfStudent = numberOfStudent;
		this.subjects = subjects;
	}

	public Faculty(Integer id, String name, Integer numberOfStudent, List<Subjects> subjects) {
		super();
		this.id = id;
		this.name = name;
		this.numberOfStudent = numberOfStudent;
		this.subjects = subjects;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumberOfStudent() {
		return numberOfStudent;
	}

	public void setNumberOfStudent(Integer numberOfStudent) {
		this.numberOfStudent = numberOfStudent;
	}

	public List<Subjects> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subjects> subjects) {
		this.subjects = subjects;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((numberOfStudent == null) ? 0 : numberOfStudent.hashCode());
		result = prime * result + ((subjects == null) ? 0 : subjects.hashCode());
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numberOfStudent == null) {
			if (other.numberOfStudent != null)
				return false;
		} else if (!numberOfStudent.equals(other.numberOfStudent))
			return false;
		if (subjects == null) {
			if (other.subjects != null)
				return false;
		} else if (!subjects.equals(other.subjects))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Faculty [id=" + id + ", name=" + name + ", numberOfStudent=" + numberOfStudent + ", subjects="
				+ subjects + "]";
	}
	
	
}
	
