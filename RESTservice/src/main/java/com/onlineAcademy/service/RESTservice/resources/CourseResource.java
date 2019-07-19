package com.onlineAcademy.service.RESTservice.resources;

import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.onlineAcademy.service.RESTservice.model.Category;
import com.onlineAcademy.service.RESTservice.model.Course;
import com.onlineAcademy.service.RESTservice.resources.beans.CourseFilterBean;
//import com.academy.onlineAcademy.model.Course;
import com.onlineAcademy.service.RESTservice.service.CourseService;

@Path("/courses")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CourseResource {
	
	CourseService courseService = new CourseService();
	
	@GET
	public List<Course> getCourses(@BeanParam CourseFilterBean filterBean){
		try {
			if (!filterBean.getCategory().isEmpty()) {
				return courseService.getCoursesByCategory(filterBean.getCategory());
			}
		}
		catch(Exception ex1) {
			try {
				if (!filterBean.getLevel().isEmpty()) {
					return courseService.getCoursesByLevel(filterBean.getLevel());
				}
			}
			catch (Exception ex2) {
				
			}
		}
		return courseService.getCourses();
	}
	
	@GET
	@Path("/{courseId}")
	public Course getCourse(@PathParam("courseId") long id) {
		return courseService.getCourse(id);
	}
	
	@POST
	public Course addCourse(Course course) {
		return courseService.addCourse(course);
	}
	
	@PUT
	@Path("/{courseId}")
	public Course updateCourse(@PathParam("/{courseId}") long id, Course course) {
		course.setId(id);
		return courseService.updateCourse(course);
	}
	
	@DELETE
	@Path("/{courseId}")
	public void deleteCourse(@PathParam("/{courseId}") long id) {
		courseService.deleteCourse(id);
	}

}
