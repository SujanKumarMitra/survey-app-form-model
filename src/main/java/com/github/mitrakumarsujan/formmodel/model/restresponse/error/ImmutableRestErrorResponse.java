package com.github.mitrakumarsujan.formmodel.model.restresponse.error;

import java.util.Collection;

import org.springframework.http.HttpStatus;

import com.github.mitrakumarsujan.formmodel.model.restresponse.RestErrorResponse;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-11-02
 */
public class ImmutableRestErrorResponse implements RestErrorResponse {

	private final RestErrorResponse delegatee;

	public ImmutableRestErrorResponse(RestErrorResponse errorResponse) {
		this.delegatee = errorResponse;
	}

	public ImmutableRestErrorResponse(HttpStatus status, String message, Collection<ErrorInfo> errors) {

		this.delegatee = new RestErrorResponse() {

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

		};
	}

	@Override
	public HttpStatus getStatus() {
		return delegatee.getStatus();
	}

	@Override
	public String getMessage() {
		return delegatee.getMessage();
	}

	@Override
	public Collection<ErrorInfo> getErrors() {
		return delegatee.getErrors();
	}

}
