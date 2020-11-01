package com.github.mitrakumarsujan.formmodel.model.restresponse;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-31
 */
public class EntityListImpl<E> implements EntityList<E> {

	private List<E> list;

	public EntityListImpl() {
		this(false);
	}
	
	public EntityListImpl(boolean initialize) {
		if(initialize) {
			list = new LinkedList<>();
		}
	}

	public EntityListImpl(List<E> list) {
		this.list = list;
	}

	@Override
	public List<E> getList() {
		return list;
	}

	@Override
	public void setList(List<E> list) {
		this.list = list;
	}

}
