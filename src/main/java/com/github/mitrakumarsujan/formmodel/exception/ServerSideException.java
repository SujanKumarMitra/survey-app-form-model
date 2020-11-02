package com.github.mitrakumarsujan.formmodel.exception;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-11-02
 */
public class ServerSideException extends ApplicationException {

	private static final long serialVersionUID = -4295952450181214447L;

	public ServerSideException() {
		super();
	}

	public ServerSideException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ServerSideException(String message, Throwable cause) {
		super(message, cause);
	}

	public ServerSideException(String message) {
		super(message);
	}

	public ServerSideException(Throwable cause) {
		super(cause);
	}

}
