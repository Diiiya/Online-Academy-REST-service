package com.onlineAcademy.service.RESTservice.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.onlineAcademy.service.RESTservice.model.Shape;
import com.onlineAcademy.service.RESTservice.service.ShapeService;

@Path("/shapes")
public class ShapeResource {

	ShapeService shapeService = new ShapeService();
	
	@GET
//	@Produces(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_JSON)
	public List<?> getShapes() {
		return shapeService.getAllShapes();
	}
	
//	@GET
//	@Produces(MediaType.APPLICATION_XML)
//	public String getShapes() {
//		return shapeService.getAllShapes().get(1).getName();
//	}
	
//	@GET
//	@Produces(MediaType.APPLICATION_XML)
//	public Shape getShapes() {
//		return shapeService.getAllShapes().get(0);
//	}
	
}
