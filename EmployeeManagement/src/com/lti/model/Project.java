package com.lti.model;

public class Project {
	int projectcode;
	String projectName;
	public Project(int projectcode, String projectName) {
		super();
		this.projectcode = projectcode;
		this.projectName = projectName;
	}
	public int getProjectcode() {
		return projectcode;
	}
	public void setProjectcode(int projectcode) {
		this.projectcode = projectcode;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public Project() {
		super();
	}
	

}
