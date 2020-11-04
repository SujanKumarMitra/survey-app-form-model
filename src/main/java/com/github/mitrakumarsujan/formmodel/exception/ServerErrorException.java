package com.github.mitrakumarsujan.formmodel.exception;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-11-02
 */
public class ServerErrorException extends ApplicationException {

	private static final long serialVersionUID = -4295952450181214447L;

	public ServerErrorException() {
		super();
	}

	public ServerErrorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ServerErrorException(String message, Throwable cause) {
		super(message, cause);
	}

	public ServerErrorException(String message) {
		super(message);
	}

	public ServerErrorException(Throwable cause) {
		super(cause);
	}

}
