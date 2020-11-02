package com.github.mitrakumarsujan.formmodel.model.restresponse.success;

import org.springframework.stereotype.Component;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-25
 */
@Component
public class RestSuccessResponseBuilderFactory {

	public <T> RestSuccessResponseBuilder<T> getSingleDataBuilder() {
		return new SingleDataRestSuccessResponeBuilder<>();
	}

	public <T> RestSuccessResponseBuilder<T> getSingleDataBuilder(Class<? extends T> classType) {
		return new SingleDataRestSuccessResponeBuilder<>();
	}

	public <E> ListDataRestSuccessResponeBuilder<E> getListDataBuilder() {
		return new ListDataRestSuccessResponeBuilder<>();
	}

	public <E> ListDataRestSuccessResponeBuilder<E> getListDataBuilder(Class<? extends E> listType) {
		return new ListDataRestSuccessResponeBuilder<>();
	}

}
