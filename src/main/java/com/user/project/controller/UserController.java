package com.user.project.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.user.project.model.ProjectDetail;
import com.user.project.model.UserProjects;
import com.user.project.service.UserProjectSvc;


@RestController
@RequestMapping(value = "/")
public class UserController {

	private final Logger LOG = LoggerFactory.getLogger(getClass());

	
	private final UserProjectSvc userProjectSvc;

	public UserController(UserProjectSvc userProjectSvc) {
		this.userProjectSvc = userProjectSvc;		
	}
	
	@RequestMapping(value = "/projects/{username}", method = RequestMethod.GET)
	public UserProjects getUserProjects(@PathVariable String username) {
		LOG.info("------------------Getting projects for username: {}.", username);	
		
		return userProjectSvc.getUserProjects(username); 
	}
	
	@GetMapping(value = "/projects/{username}/{project_id}")
	public ProjectDetail getUserProjectByProjectId(@PathVariable String username, @PathVariable String project_id) {
		LOG.info("------------------Getting projects for username: {} and projectid: {} ", username, project_id);
		
		
		return userProjectSvc.getUserProjectByProjectId(username, project_id);
	}
}