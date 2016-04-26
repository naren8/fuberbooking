package com.naren.fuber.exception.mapper;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.naren.fuber.exception.InvalidInputToServiceException;

/**
 * @author naren
 * 
 */
@Provider
public class InvalidInputToServiceExceptionMapper extends FuberExceptionMapper implements
		ExceptionMapper<InvalidInputToServiceException> {

	@Override
	public Response toResponse(InvalidInputToServiceException e) {
		return createJsonResponse(Status.BAD_REQUEST, e.getMessage());
	}

}
