package com.user.project.model;

import java.util.List;

public class ProjectDetail {


	 private String projectId;
	 private String desc;
	 private List<String> contributors;
	 private String commitId;
	 
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public List<String> getContributors() {
		return contributors;
	}
	public void setContributors(List<String> contributors) {
		this.contributors = contributors;
	}
	public String getCommitId() {
		return commitId;
	}
	public void setCommitId(String commitId) {
		this.commitId = commitId;
	}
	 
}
