package project.faculty.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import project.faculty.domain.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty, Integer>{

	Faculty getById(int id);
}
