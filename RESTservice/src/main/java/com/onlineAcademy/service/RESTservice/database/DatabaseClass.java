package com.onlineAcademy.service.RESTservice.database;

import java.util.HashMap;
import java.util.Map;

import com.onlineAcademy.service.RESTservice.model.Course;
import com.onlineAcademy.service.RESTservice.model.Person;
import com.onlineAcademy.service.RESTservice.model.Shape;

public class DatabaseClass {

	// Not connected example
	private static Map<Long, Shape> shapes = new HashMap<>();
	
	public static Map<Long, Shape> getShapes() {
		return shapes;
	}
	
	// Main database used
	private static Map<Long, Course> courses = new HashMap<>();
	private static Map<String, Person> people = new HashMap<>();
	
	public static Map<Long, Course> getCourses() {
		return courses;
	}
	
	public static Map<String, Person> getPeople() {
		return people;
	}
	
}
