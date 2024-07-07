package com.assignments.LoginandRegistration.repositories;

import java.util.List;
import java.util.Locale.Category;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignments.LoginandRegistration.Models.Project;
import com.assignments.LoginandRegistration.Models.User;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {
List<Project> findAll();
List<Project> findAllByUser(User user);
List<Project> findByTeamNotContains(User user);
List<Project> findByTeamContains(User user);




}
