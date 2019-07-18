package com.onlineAcademy.service.RESTservice.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.onlineAcademy.service.RESTservice.model.Course;
//import com.academy.onlineAcademy.model.Course;
import com.onlineAcademy.service.RESTservice.service.CourseService;

@Path("/courses")
public class CourseResource {
	
	CourseService courseService = new CourseService();
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getCourse() {
		return "Hello world";
//		return courseService.getAllCourses();
	}

}
