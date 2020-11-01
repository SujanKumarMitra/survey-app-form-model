package com.github.mitrakumarsujan.formmodel.model.restresponse.success;

import org.springframework.http.HttpStatus;

import com.github.mitrakumarsujan.formmodel.model.restresponse.RestSuccessResponse;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-11-01
 */
public abstract class AbstractRestSuccessResponseBuilder<T> implements RestSuccessResponseBuilder<T> {

	private static final String DEFAULT_MESSAGE = "null";
	protected MutableRestSuccessResponse<T> response;

	public AbstractRestSuccessResponseBuilder() {
		this.response = new MutableRestSuccessResponse<>();
		response.setMessage(DEFAULT_MESSAGE);
	}

	@Override
	public RestSuccessResponseBuilder<T> withStatus(HttpStatus status) {
		response.setStatus(status);
		return this;
	}

	@Override
	public RestSuccessResponseBuilder<T> withMessage(String message) {
		response.setMessage(message);
		return this;
	}

	@Override
	public RestSuccessResponse<T> build() {
		if (!isMessageSet()) {
			// @formatter:off
			response.setMessage(response.getStatus().getReasonPhrase());
			// @formatter:on
		}
		return new ImmutableRestSuccessResponse<>(response);
	}

	private boolean isMessageSet() {
		String message = response.getMessage();
		return message == null || !message.contains(DEFAULT_MESSAGE);
	}
}
