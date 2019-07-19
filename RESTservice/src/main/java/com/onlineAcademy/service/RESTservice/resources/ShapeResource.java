package com.onlineAcademy.service.RESTservice.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.onlineAcademy.service.RESTservice.model.Shape;
import com.onlineAcademy.service.RESTservice.service.ShapeService;

@Path("/shapes")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ShapeResource {

	ShapeService shapeService = new ShapeService();
	
	@GET
//	@Produces(MediaType.APPLICATION_XML)
	public List<Shape> getShapes() {
		return shapeService.getAllShapes();
	}
	
	@GET
	@Path("/{shapeId}")
	public Shape getShape(@PathParam("shapeId") long id) {
		return shapeService.getShape(id);
	}
	
	@POST
	public Shape addShape(Shape shape) {
		return shapeService.addShape(shape);
	}
	
	@PUT
	@Path("/{shapeId}")
	public Shape updateShape(@PathParam("shapeId") long id, Shape shape) {
		shape.setId(id);
		return shapeService.updateShape(shape);
	}
	
	@DELETE
	@Path("/{shapeId}")
	public void deleteShape(@PathParam("shapeId") long id) {
		shapeService.deleteShape(id);
	}
	
}
