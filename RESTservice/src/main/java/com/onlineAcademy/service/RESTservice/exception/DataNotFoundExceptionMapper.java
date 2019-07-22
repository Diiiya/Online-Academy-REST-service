package com.onlineAcademy.service.RESTservice.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import com.onlineAcademy.service.RESTservice.model.Error;

@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException> {

	@Override
	public Response toResponse(DataNotFoundException exception) {
		Error error = new Error(exception.getMessage(), 404);
		return Response.status(Status.NOT_FOUND)
				.entity(error)
				.build();
	}

}
