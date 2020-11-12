package com.github.mitrakumarsujan.formmodel.model.restresponse.success;

/**
 * @author skmitra
 * @since 2020-11-12
 */
public interface RestSuccessResponseBuilderFactory {

	<T> RestSuccessResponseBuilder<T> getSingleDataBuilder();

	<T> RestSuccessResponseBuilder<T> getSingleDataBuilder(Class<? extends T> classType);

	<E> ListDataRestSuccessResponeBuilder<E> getListDataBuilder();

	<E> ListDataRestSuccessResponeBuilder<E> getListDataBuilder(Class<? extends E> listType);

}