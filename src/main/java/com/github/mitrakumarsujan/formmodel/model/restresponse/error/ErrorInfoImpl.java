package com.github.mitrakumarsujan.formmodel.model.restresponse.error;

import java.util.Optional;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-11-02
 */
public class ErrorInfoImpl implements ErrorInfo {

	private static final long serialVersionUID = 7448647029060797298L;
	
	private final String reason;
	private final Optional<String> cause;

	public ErrorInfoImpl(String reason) {
		this(reason, null);
	}

	public ErrorInfoImpl(String reason, String cause) {
		this.cause = (cause == null) ? Optional.empty() : Optional.of(cause);
		this.reason = reason;
	}

	@Override
	public Optional<String> getCause() {
		return cause;
	}

	@Override
	public String getReason() {
		return reason;
	}

}
