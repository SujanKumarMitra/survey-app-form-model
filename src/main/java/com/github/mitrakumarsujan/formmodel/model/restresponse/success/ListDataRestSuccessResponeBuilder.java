package com.github.mitrakumarsujan.formmodel.model.restresponse.success;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

import com.github.mitrakumarsujan.formmodel.model.restresponse.EntityList;
import com.github.mitrakumarsujan.formmodel.model.restresponse.EntityListImpl;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-25
 */
public class ListDataRestSuccessResponeBuilder<E> extends AbstractRestSuccessResponseBuilder<EntityList<E>> implements RestSuccessResponseBuilder<EntityList<E>> {

	public RestSuccessResponseBuilder<EntityList<E>> withData(List<E> data) {
		setIfNull(response::getData, response::setData, EntityListImpl::new);
		EntityList<E> entityList = response.getData();
		setIfNullOrElse(entityList::getList, entityList::setList, () -> data, (list) -> list.addAll(data));
		return this;
	}


	public RestSuccessResponseBuilder<EntityList<E>> addEntity(E data) {
		setIfNull(response::getData, response::setData, EntityListImpl::new);
		EntityList<E> entityList = response.getData();
		setIfNull(entityList::getList, entityList::setList, LinkedList::new);
		List<E> list = entityList.getList();
		list.add(data);
		return this;
	}

	@Override
	public RestSuccessResponseBuilder<EntityList<E>> withData(EntityList<E> data) {
		response.setData(data);
		return this;
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
