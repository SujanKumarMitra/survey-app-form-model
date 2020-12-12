package com.github.mitrakumarsujan.formmodel.exception;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-11-03
 */
public class DuplicateKeyException extends RuntimeException {

	private static final long serialVersionUID = -7482465692909071669L;
	
	public DuplicateKeyException() {
	}

	public DuplicateKeyException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public DuplicateKeyException(String message, Throwable cause) {
		super(message, cause);
	}

	public DuplicateKeyException(String message) {
		super(message);
	}

	public DuplicateKeyException(Throwable cause) {
		super(cause);
	}

}
