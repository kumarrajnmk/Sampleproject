package com.nmk.ecomm.api.exception.handler;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.nmk.ecomm.api.exception.ECommHTTP404Exception;
import com.nmk.ecomm.api.exception.ECommHTTPException;

/**
 * @author NMK OPT 1
 *
 */
@ControllerAdvice
public class ECommAPIExceptionHandler extends ResponseEntityExceptionHandler {
	private static final Logger LOGGER = Logger.getLogger(ECommAPIExceptionHandler.class);

	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handleInternalServerError(final Exception ex, final WebRequest request) {

		LOGGER.debug("Start : ECommAPIExceptionHandler.handleInternalServerError()  ");
		// System.out.println("");
		final List<String> details = new ArrayList<>();
		details.add(ex.getLocalizedMessage());
		final ECommHTTPException error = new ECommHTTPException("SERVER_TECHNICAL_ERROR", details,
				HttpStatus.INTERNAL_SERVER_ERROR.value(), new Date());
		LOGGER.debug("End : ECommAPIExceptionHandler.handleInternalServerError()  ");

		return new ResponseEntity<Object>(error, HttpStatus.INTERNAL_SERVER_ERROR);

	}

	@ExceptionHandler(ECommHTTP404Exception.class)
	public ResponseEntity<Object> recordNotFoundException(final ECommHTTP404Exception ex, final WebRequest request) {

		LOGGER.debug("Start : ECommAPIExceptionHandler.recordNotFoundException()  ");
		final List<String> details = new ArrayList<>();
		details.add(ex.getLocalizedMessage());
		final ECommHTTPException error = new ECommHTTPException("RESOURCE_NOT_FOUND", details,
				HttpStatus.NOT_FOUND.value(), new Date());
		LOGGER.debug("End : ECommAPIExceptionHandler.recordNotFoundException()  ");
		return new ResponseEntity<Object>(error, HttpStatus.NOT_FOUND);

	}
}
