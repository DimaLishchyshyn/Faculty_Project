package project.faculty.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import project.faculty.domain.Entrant;


public interface EntrantRepository extends JpaRepository<Entrant, Integer>{

}