package com.github.mitrakumarsujan.formmodel.model.restresponse.error;

import java.util.Collection;
import java.util.Collections;

import org.springframework.http.HttpStatus;

import com.github.mitrakumarsujan.formmodel.model.restresponse.RestErrorResponse;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-11-02
 */
public class RestErrorResponseBuilder {

	private static final String DEFAULT_ERROR_MESSAGE = "Something went wrong. Please try again later.";
	private MutableRestErrorResponse response;

	public RestErrorResponseBuilder() {
		this.response = new MutableRestErrorResponse(null);
		response.setMessage(DEFAULT_ERROR_MESSAGE);
	}

	public RestErrorResponseBuilder withErrors(Collection<ErrorInfo> errors) {
		response.setErrors(errors);
		return this;
	}

	public RestErrorResponseBuilder withStatus(HttpStatus status) {
		response.setStatus(status);
		return this;
	}

	public RestErrorResponseBuilder withMessage(String message) {
		response.setMessage(message);
		return this;
	}

	public RestErrorResponse build() {
		if (response.getErrors() == null) {
			response.setErrors(Collections.emptyList());
		}
		if (!isMessageSet()) {
			// @formatter:off
			response.setMessage(response.getStatus().getReasonPhrase());
			// @formatter:on
		}
		return new ImmutableRestErrorResponse(response);
	}
	
	private boolean isMessageSet() {
		String message = response.getMessage();
		return message == null || !message.contains(DEFAULT_ERROR_MESSAGE);
	}
}
