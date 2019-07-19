package com.onlineAcademy.service.RESTservice.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import com.onlineAcademy.service.RESTservice.model.Course;
//import com.academy.onlineAcademy.controller.CourseController;
//import com.academy.onlineAcademy.model.Course;
import com.onlineAcademy.service.RESTservice.model.Category;
import com.onlineAcademy.service.RESTservice.model.Course;
import com.onlineAcademy.service.RESTservice.model.Level;

public class CourseService {
	
	private Map<Long, Course> courses = new HashMap<Long, Course>();
	
	public CourseService() {
		courses.put(1L, new Course(1, "Web development", Level.BEGINNER, Category.IT));
		courses.put(2L, new Course(2, "Drawing", Level.INTERMEDIATE, Category.ARTS));
		courses.put(3L, new Course(3, "French", Level.BEGINNER, Category.LANGUAGES));
	}

	public List<Course> getCourses() {
		return new ArrayList<Course>(courses.values());
	}
	
	public List<Course> getCoursesByCategory(String category) {
		List<Course> coursesByCategory = new ArrayList<>();
		for(Course course : courses.values()) {
			if(course.getCategory().toString().equals(category)) {
				coursesByCategory.add(course);
			}
		}
		return coursesByCategory;
	}
	
	public List<Course> getCoursesByLevel(String level) {
		List<Course> coursesByLevel = new ArrayList<>();
		for(Course course : courses.values()) {
			if(course.getLevel().toString().equals(level)) {
				coursesByLevel.add(course);
			}
		}
		return coursesByLevel;
	}
	
	public Course getCourse(long id) {
		return courses.get(id);
	}
	
	public Course addCourse(Course course) {
		course.setId(courses.size() + 1);
		courses.put(course.getId(), course);
		return course;
	}
	
	public Course updateCourse(Course course) {
		if(course.getId() <= 0) {
			return null;
		}
		courses.put(course.getId(), course);
		return course;
	}
	
	public Course deleteCourse(long id) {
		return courses.remove(id);
	}
}
