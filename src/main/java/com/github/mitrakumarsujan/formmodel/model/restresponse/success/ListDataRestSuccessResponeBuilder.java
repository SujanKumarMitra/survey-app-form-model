package com.github.mitrakumarsujan.formmodel.model.restresponse.success;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

import org.springframework.http.HttpStatus;

import com.github.mitrakumarsujan.formmodel.model.restresponse.EntityList;
import com.github.mitrakumarsujan.formmodel.model.restresponse.EntityListImpl;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-25
 */
public class ListDataRestSuccessResponeBuilder<E> extends AbstractRestSuccessResponseBuilder<EntityList<E>>
		implements RestSuccessResponseBuilder<EntityList<E>> {

	public ListDataRestSuccessResponeBuilder<E> withList(List<E> data) {
		setIfNull(response::getData, response::setData, this::getEntityList);
		EntityList<E> entityList = response.getData();
		setIfNullOrElse(entityList::getItems, entityList::setItems, () -> data, list -> list.addAll(data));
		return this;
	}

	public ListDataRestSuccessResponeBuilder<E> addEntity(E data) {
		setIfNull(response::getData, response::setData, this::getEntityList);
		EntityList<E> entityList = response.getData();
		setIfNull(entityList::getItems, entityList::setItems, LinkedList::new);
		List<E> list = entityList.getItems();
		list.add(data);
		return this;
	}

	@Override
	public ListDataRestSuccessResponeBuilder<E> withData(EntityList<E> data) {
		response.setData(data);
		return this;
	}

	public ListDataRestSuccessResponeBuilder<E> withOffset(int offset) {
		setIfNull(response::getData, response::setData, this::getEntityList);
		EntityList<E> entityList = response.getData();
		entityList.setOffset(offset);
		return this;
	}

	@Override
	public ListDataRestSuccessResponeBuilder<E> withStatus(HttpStatus status) {
		super.withStatus(status);
		return this;
	}

	@Override
	public ListDataRestSuccessResponeBuilder<E> withMessage(String message) {
		super.withMessage(message);
		return this;
	}

	private EntityList<E> getEntityList() {
		return new EntityListImpl<>(null, 0);
	}

	<T> boolean setIfNull(Supplier<T> getter, Consumer<T> setter, Supplier<T> data) {
		if (getter.get() == null) {
			setter.accept(data.get());
			return true;
		}
		return false;
	}

	<T> boolean setIfNullOrElse(Supplier<T> getter, Consumer<T> setter, Supplier<T> data, Consumer<T> orElse) {
		T t = getter.get();
		if (t == null) {
			setter.accept(data.get());
			return true;
		} else {
			orElse.accept(t);
			return false;
		}
	}

}
