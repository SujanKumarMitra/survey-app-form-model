package com.github.mitrakumarsujan.formmodel.model.response.success;

import org.springframework.http.HttpStatus;

import com.github.mitrakumarsujan.formmodel.model.response.RestSuccessResponse;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-25
 */
public class SingleDataRestSuccessResponeBuilder<T> implements RestSuccessResponseBuilder<T> {

	private static final String DEFAULT_MESSAGE = "null";
	private MutableRestSuccessResponse<T> response;

	public SingleDataRestSuccessResponeBuilder(MutableRestSuccessResponse<T> response) {
		this.response = response;
	}

	public SingleDataRestSuccessResponeBuilder() {
		this(new MutableRestSuccessResponse<>());
		response.setMessage(DEFAULT_MESSAGE);
	}

	@Override
	public RestSuccessResponseBuilder<T> withData(T data) {
		response.setData(data);
		return this;
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
		if(messageNotSet()) {
			response.setMessage(response.getStatus().getReasonPhrase());
		}
		return new ImmutableRestSuccessResponse<>(response);
	}

	private boolean messageNotSet() {
		try {
			return response.getMessage().contentEquals(DEFAULT_MESSAGE);
		} catch (NullPointerException e) {
			return false;
		}
	}

}
