package com.onlineAcademy.service.RESTservice.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.onlineAcademy.service.RESTservice.model.Error;

//@Provider
//public class GenericExceptionMapper implements ExceptionMapper<Throwable> {
//
//	@Override
//	public Response toResponse(Throwable exception) {
//		Error error = new Error(exception.getMessage(), 500);
//		return Response.status(Status.INTERNAL_SERVER_ERROR)
//				.entity(error)
//				.build();
//	}
//	
//}
