package com.assignments.LoginandRegistration.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignments.LoginandRegistration.Models.Project;
import com.assignments.LoginandRegistration.repositories.ProjectRepository;

@Service
public class ProjectService {
@Autowired
ProjectRepository projectRepo;

public List<Project> allProject() {
    return projectRepo.findAll();
}

public Project createProject(Project p) {
    return projectRepo.save(p);
}

public Project findProject(Long id) {
    Optional<Project> optionalProject = projectRepo.findById(id);
    if(optionalProject.isPresent()) {
        return optionalProject.get();
    } else {
        return null;
    }
}
public Project editProject(Project p) {
	return projectRepo.save(p);
}
public void deleteById (Long id) {
	 projectRepo.deleteById(id);
}
}
