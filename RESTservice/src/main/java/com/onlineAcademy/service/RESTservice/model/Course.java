package com.onlineAcademy.service.RESTservice.model;

import java.util.List;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement
public class Course {
	
	private int id;
	private String name;
//	private String description;
//	private String teacherName;
//	private int duration;
	private Level level;
	private Category category;
//	private double price;
//	private boolean givesCertificate;
//	private byte[] coverPhoto;
////	private Order order;
////	private List<Person> listOfPeople;
//
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
//	public String getDescription() {
//		return description;
//	}
//	public void setDescription(String description) {
//		this.description = description;
//	}
//	public String getTeacherName() {
//		return teacherName;
//	}
//	public void setTeacherName(String teacherName) {
//		this.teacherName = teacherName;
//	}
//	public int getDuration() {
//		return duration;
//	}
//	public void setDuration(int duration) {
//		this.duration = duration;
//	}
	public Level getLevel() {
		return level;
	}
	public void setLevel(Level level) {
		this.level = level;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
//	public double getPrice() {
//		return price;
//	}
//	public void setPrice(double price) {
//		this.price = price;
//	}
//	public boolean isGivesCertificate() {
//		return givesCertificate;
//	}
//	public void setGivesCertificate(boolean givesCertificate) {
//		this.givesCertificate = givesCertificate;
//	}
//	public byte[] getCoverPhoto() {
//		return coverPhoto;
//	}
//	public void setCoverPhoto(byte[] coverPhoto) {
//		this.coverPhoto = coverPhoto;
//	}
//	
//	public Course(int id, String name, String description, String teacherName, int duration, Level level,
//			Category category, double price, boolean givesCertificate, byte[] coverPhoto) {
	public Course(int id, String name, Level level, Category category) {
		super();
		this.id = id;
		this.name = name;
//		this.description = description;
//		this.teacherName = teacherName;
//		this.duration = duration;
		this.level = level;
		this.category = category;
//		this.price = price;
//		this.givesCertificate = givesCertificate;
//		this.coverPhoto = coverPhoto;
	}
//
//	
}
