package com.onlineAcademy.service.RESTservice.service;

import java.util.ArrayList;
import java.util.List;

//import com.onlineAcademy.service.RESTservice.model.Course;
//import com.academy.onlineAcademy.controller.CourseController;
//import com.academy.onlineAcademy.model.Course;
import com.onlineAcademy.service.RESTservice.model.Category;
import com.onlineAcademy.service.RESTservice.model.Course;
import com.onlineAcademy.service.RESTservice.model.Level;

public class CourseService {

	public List<Course> getAllCourses() {
//		CourseController courseObj = new CourseController();
		List<Course> allCoursesList = new ArrayList<Course>();
//		allCoursesList =  courseObj.getAllCourses();
		Course course1 = new Course(1, "WEb", Level.BEGINNER, Category.IT);
		Course course2 = new Course(2, "French", Level.BEGINNER, Category.LANGUAGES);
		allCoursesList.add(course1);
		allCoursesList.add(course2);
		return allCoursesList;
	}
	
}
