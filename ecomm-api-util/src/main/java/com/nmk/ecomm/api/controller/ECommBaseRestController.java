package com.nmk.ecomm.api.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.nmk.ecomm.api.exception.ECommHTTPException;

/**
 * @author NMK OPT 1
 *
 */
public class ECommBaseRestController extends ResponseEntityExceptionHandler {
	private static final Logger LOGGER = Logger.getLogger(ECommBaseRestController.class);

	/*
	 * private static final Logger logger =
	 * LoggerFactory.getLogger(ECommBaseRestController.class);
	 */
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(final MethodArgumentNotValidException ex,
			final HttpHeaders headers, final HttpStatus status, final WebRequest request) {

		logger.debug("Start : ECommBaseRestController.handleMethodArgumentNotValid()");

		final List<String> details = new ArrayList<>();
		for (final ObjectError error : ex.getBindingResult().getAllErrors()) {
			details.add(error.getDefaultMessage());
		}
		logger.debug("End : ECommBaseRestController.handleMethodArgumentNotValid()");

		final ECommHTTPException error = new ECommHTTPException("REQUEST_DATA_VALIDATION_ERROR", details,
				HttpStatus.BAD_REQUEST.value(), new Date());

		return new ResponseEntity(error, HttpStatus.BAD_REQUEST);
	}
}
