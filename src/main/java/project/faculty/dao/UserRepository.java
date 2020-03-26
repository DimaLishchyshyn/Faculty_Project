package project.faculty.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import project.faculty.domain.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByEmail(String email);

}
