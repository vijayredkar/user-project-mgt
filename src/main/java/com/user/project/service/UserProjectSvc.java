package com.user.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.user.project.model.Project;
import com.user.project.model.ProjectDetail;
import com.user.project.model.UserProjects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class UserProjectSvc {
	
	private final Logger LOG = LoggerFactory.getLogger(getClass());
	
	public UserProjects getUserProjects(String userName) {
		UserProjects userProjects = new UserProjects();
		Project project = new Project();	
		List<Project> projects =  new ArrayList<Project>();
		
		userProjects.setUserName("ProjectContributor1");
		project.setProjectId("project1");
		project.setTitle("Project Title 1");
		project.setUrl("http://orgname:8080/test/project1");
		
		projects.add(project);		
		userProjects.setProjects(projects);
		return userProjects;
	}
	
	public ProjectDetail getUserProjectByProjectId(String username, String projectId) {
		
		
		ProjectDetail projectDetails = new ProjectDetail();	
		List<String> contributors =  new ArrayList<String>();
		
		projectDetails.setCommitId("commitid1");
		projectDetails.setDesc("50 word excerpt --------------------- ");
		projectDetails.setProjectId("project1");
		
		contributors.add("contributor1");
		contributors.add("contributor2");
		contributors.add("contributor3");
		contributors.add("contributor4");		
		
		projectDetails.setContributors(contributors);
		return projectDetails;
	}
}
