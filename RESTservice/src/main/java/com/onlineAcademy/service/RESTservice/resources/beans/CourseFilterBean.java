package com.onlineAcademy.service.RESTservice.resources.beans;

import javax.ws.rs.QueryParam;

public class CourseFilterBean {

	private @QueryParam("category") String category;
    private @QueryParam("level") String level;
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	
}
