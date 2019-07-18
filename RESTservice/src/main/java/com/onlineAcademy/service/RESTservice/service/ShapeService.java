package com.onlineAcademy.service.RESTservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.onlineAcademy.service.RESTservice.database.DatabaseClass;
import com.onlineAcademy.service.RESTservice.model.Shape;

public class ShapeService {

	private Map<Long, Shape> shapes = DatabaseClass.getShapes();
	
	public ShapeService() {
		shapes.put(1L, new Shape(1, "Circle", "Purple"));
		shapes.put(2L, new Shape(2, "Square", "Blue"));
	}
	
	public List<Shape> getAllShapes() {
//		Shape shape1 = new Shape("Circle", "Purple");
//		Shape shape2 = new Shape("Square", "Blue");
//		List<Shape> shapes = new ArrayList<>();
//		shapes.add(shape1);
//		shapes.add(shape2);
//		return shapes;
		return new ArrayList<Shape>(shapes.values());
	}
	
	public Shape getShape(long id) {
		return shapes.get(id);
	}
	
	public Shape addShape(Shape shape) {
		shape.setId(shapes.size() + 1);
		shapes.put(shape.getId(), shape);
		return shape;
	}
	
	public Shape deleteShape(long id) {
		return shapes.remove(id);
	}
	
}
