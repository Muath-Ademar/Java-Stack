package com.assignments.LoginandRegistration.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignments.LoginandRegistration.Models.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {
List<Project> findAll();
}
