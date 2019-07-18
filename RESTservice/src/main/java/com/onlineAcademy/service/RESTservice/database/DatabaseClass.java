package com.onlineAcademy.service.RESTservice.database;

import java.util.HashMap;
import java.util.Map;

import com.onlineAcademy.service.RESTservice.model.Shape;

public class DatabaseClass {

	private static Map<Long, Shape> shapes = new HashMap<>();
	
	public static Map<Long, Shape> getShapes() {
		return shapes;
	}
	
}
