package com.onlineAcademy.service.RESTservice.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("inject")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class InjectResource {

	@GET
	@Path("annotations")
	public String getMatrixParams(@MatrixParam("matrix") String matrixParam,
								  @HeaderParam("sessionID") String headerParam,
								  @CookieParam("name") String cookieParam) {
		
		return "Matrix param: " + matrixParam + "\r\n"
				+ "Header param: " + headerParam + "\r\n"
				+ "Cookie param: " + cookieParam;
	}
	

	
}
