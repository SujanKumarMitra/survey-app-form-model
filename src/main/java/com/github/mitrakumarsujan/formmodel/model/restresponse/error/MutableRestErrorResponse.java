package com.github.mitrakumarsujan.formmodel.model.restresponse.error;

import java.util.Collection;

import org.springframework.http.HttpStatus;

import com.github.mitrakumarsujan.formmodel.model.restresponse.RestErrorResponse;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-11-02
 */
public class MutableRestErrorResponse implements RestErrorResponse {

	private HttpStatus status;
	private String message;
	private Collection<ErrorInfo> errors;

	public MutableRestErrorResponse(Collection<ErrorInfo> errors) {
		this(HttpStatus.BAD_REQUEST, errors);
	}

	public MutableRestErrorResponse(HttpStatus status, Collection<ErrorInfo> errors) {
		this(status, status.getReasonPhrase(), errors);
	}

	public MutableRestErrorResponse(HttpStatus status, String message, Collection<ErrorInfo> errors) {
		this.status = status;
		this.message = message;
		this.errors = errors;
	}

	@Override
	public HttpStatus getStatus() {
		return status;
	}

	@Override
	public String getMessage() {
		return message;
	}

	@Override
	public Collection<ErrorInfo> getErrors() {
		return errors;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setErrors(Collection<ErrorInfo> errors) {
		this.errors = errors;
	}

}
