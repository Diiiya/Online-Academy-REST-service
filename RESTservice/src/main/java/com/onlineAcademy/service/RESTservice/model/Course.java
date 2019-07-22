package com.onlineAcademy.service.RESTservice.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlTransient;

//@XmlRootElement
public class Course {
	
	private long id;
	private String name;
	private Level level;
	private Category category;
	private Map<Long, Review> reviews = new HashMap<>();
	private List<Link> links = new ArrayList<>();

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
	@XmlTransient
    public Map<Long, Review> getReviews() {
		return reviews;
	}
	public void setReviews(Map<Long, Review> reviews) {
		this.reviews = reviews;
	}
	public List<Link> getLinks() {
		return links;
	}
	public void setLinks(List<Link> links) {
		this.links = links;
	}

    public Course() {
    	
    }
    
	public Course(long id, String name, Level level, Category category, Map<Long, Review> reviews) {
		super();
		this.id = id;
		this.name = name;
		this.level = level;
		this.category = category;
		this.reviews = reviews;
	}
	
	public void addLink(String url, String rel) {
		Link link = new Link();
		link.setLink(url);
		link.setRel(rel);
		links.add(link);
	}

}
