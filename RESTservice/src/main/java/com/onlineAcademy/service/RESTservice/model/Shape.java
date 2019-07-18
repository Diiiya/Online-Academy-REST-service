package com.onlineAcademy.service.RESTservice.model;


import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Shape {

	@XmlElement(name = "id")
	private long id;
	@XmlElement(name = "name")
	private String name;
	@XmlElement(name = "color")
	private String color;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public Shape(long id, String name, String color) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
	}
	
	public Shape() {
		
	}

	
}
