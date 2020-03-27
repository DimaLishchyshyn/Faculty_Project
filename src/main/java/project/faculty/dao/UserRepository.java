package project.faculty.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import project.faculty.domain.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	Optional<User> findByEmail(String email);

}
