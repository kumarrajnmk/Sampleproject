package com.nmk.ecomm.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * For HTTP 404 Not Found errros
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ECommHTTP404Exception extends RuntimeException {

	private static final long serialVersionUID = -5013633049402431576L;

	public ECommHTTP404Exception(final String exception) {
		super(exception);

	}
}
