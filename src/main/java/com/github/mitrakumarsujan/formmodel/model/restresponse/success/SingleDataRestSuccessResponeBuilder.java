package com.github.mitrakumarsujan.formmodel.model.restresponse.success;

import org.springframework.http.HttpStatus;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-25
 */
public class SingleDataRestSuccessResponeBuilder<T> extends AbstractRestSuccessResponseBuilder<T>
		implements RestSuccessResponseBuilder<T> {

	public SingleDataRestSuccessResponeBuilder(MutableRestSuccessResponse<T> response) {
		this.response = response;
	}

	public SingleDataRestSuccessResponeBuilder() {
	}

	@Override
	public SingleDataRestSuccessResponeBuilder<T> withStatus(HttpStatus status) {
		super.withStatus(status);
		return this;
	}

	@Override
	public SingleDataRestSuccessResponeBuilder<T> withMessage(String message) {
		super.withMessage(message);
		return this;
	}

	@Override
	public SingleDataRestSuccessResponeBuilder<T> withData(T data) {
		response.setData(data);
		return this;
	}
}
