package com.assignments.LoginandRegistration.repositories;

import java.util.List;
import java.util.Locale.Category;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignments.LoginandRegistration.Models.Project;
import com.assignments.LoginandRegistration.Models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
	@Override
	List<User> findAll();
	
	Optional<User> findByEmail(String email);
	List<User> findAllByProjects(Project product);

	// Retrieves a list of any categories a particular product
	// does not belong to.
	List<User> findByProjectsNotContains(Project project);
}

