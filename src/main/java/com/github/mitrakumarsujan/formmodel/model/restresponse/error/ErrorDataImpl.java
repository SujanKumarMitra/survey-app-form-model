package com.github.mitrakumarsujan.formmodel.model.restresponse.error;

import java.util.Optional;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-11-02
 */
public class ErrorDataImpl implements ErrorData {

	private final String reason;
	private final Optional<Throwable> cause;
	private final String message;

	public ErrorDataImpl(String message) {
		this(message, message);
	}

	public ErrorDataImpl(String reason, String message) {
		this(reason, null, message);
	}

	public ErrorDataImpl(String reason, Throwable cause, String message) {
		this.reason = reason;
		this.cause = (cause == null) ? Optional.empty() : Optional.of(cause);
		this.message = message;
	}

	@Override
	public String getReason() {
		return reason;
	}

	@Override
	public Optional<Throwable> getCause() {
		return cause;
	}

	@Override
	public String getMessage() {
		return message;
	}

}
