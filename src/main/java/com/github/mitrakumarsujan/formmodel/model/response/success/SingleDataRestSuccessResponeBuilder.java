package com.github.mitrakumarsujan.formmodel.model.response.success;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-25
 */
public class SingleDataRestSuccessResponeBuilder<T> extends AbstractRestSuccessResponseBuilder<T> implements RestSuccessResponseBuilder<T> {

	public SingleDataRestSuccessResponeBuilder(MutableRestSuccessResponse<T> response) {
		this.response = response;
	}

	public SingleDataRestSuccessResponeBuilder() {
		super();
	}

	@Override
	public RestSuccessResponseBuilder<T> withData(T data) {
		response.setData(data);
		return this;
	}
}
