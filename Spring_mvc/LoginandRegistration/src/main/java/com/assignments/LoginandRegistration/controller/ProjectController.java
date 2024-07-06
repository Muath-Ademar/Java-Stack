package com.assignments.LoginandRegistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.assignments.LoginandRegistration.Models.Project;
import com.assignments.LoginandRegistration.Models.User;
import com.assignments.LoginandRegistration.service.ProjectService;
import com.assignments.LoginandRegistration.service.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class ProjectController {
	@Autowired
	UserService userservice;
	@Autowired
	ProjectService projectService;

	@GetMapping("/dash")
	public String dashboard(@ModelAttribute("user") User user, Model model, HttpSession session) {
		Long userId = (Long) session.getAttribute("userid");
		User currentUser = userservice.findById(userId);
		model.addAttribute("user", currentUser);
		model.addAttribute("projects", projectService.allProject());
		return "Welcome.jsp";
	}

	@GetMapping("/projects/new")
	public String addProjectPage(@ModelAttribute("project") Project project, Model model) {
		return "addproject.jsp";
	}

	@PostMapping("/addproject")
	public String addProject(@Valid @ModelAttribute("project") Project project, BindingResult result,
			HttpSession session) {
		if (result.hasErrors()) {
			return "addproject.jsp";
		}
		User user = userservice.findById((Long) session.getAttribute("userid"));
		project.setUser(user);
		projectService.createProject(project);
		return "redirect:/dash";
	}

	@GetMapping("projects/edit/{id}")
	public String showEdit(@PathVariable("id") Long id, Model model, HttpSession session) {
		if(session.getAttribute("userid") == null) {
			return "redirect:/logout";
		}
		
		Project project = projectService.findProject(id);
		model.addAttribute("projects", project);
		return "editproject.jsp";
	}
	@PutMapping("edit/{id}")
	public String edit(@Valid @PathVariable("id") Long id, @ModelAttribute("projects") Project project, BindingResult result
			, HttpSession session) {
		if (session.getAttribute("userid") == null) {
			return "redirect:/logout";
		}

		
		
		if(result.hasErrors()) {
			return "editproject.jsp";
		}
		User userId= userservice.findById((Long) session.getAttribute("userid"));
		project.setUser(userId);
		 projectService.editProject(project);
		
		return "redirect:/dash";
			
	}

	@GetMapping("projects/{id}")
	public String details(@PathVariable("id") Long id, @ModelAttribute("projects") Project project, Model model) {
		Project projects = projectService.findProject(id);
		model.addAttribute("projects", projects);
		return "details.jsp";
	}

}
