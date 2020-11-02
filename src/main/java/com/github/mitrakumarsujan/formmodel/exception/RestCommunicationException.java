package com.github.mitrakumarsujan.formmodel.exception;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-11-02
 */
public class RestCommunicationException extends ApplicationException {

	private static final long serialVersionUID = -1776890072933702009L;

	public RestCommunicationException() {
	}

	public RestCommunicationException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public RestCommunicationException(String message, Throwable cause) {
		super(message, cause);
	}

	public RestCommunicationException(String message) {
		super(message);
	}

	public RestCommunicationException(Throwable cause) {
		super(cause);
	}

}
