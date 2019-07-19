package com.onlineAcademy.service.RESTservice.model;

public class Person {

	private int id;
	private String name;
	private String username;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public Person() {
		
	}
	
	public Person(int id, String name, String username) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
	}

	
}
