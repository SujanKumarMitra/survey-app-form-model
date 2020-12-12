package com.github.mitrakumarsujan.formmodel.model.restresponse;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-31
 */
@JsonPropertyOrder({ "size", "offset", "items" })
public class EntityListImpl<E> implements EntityList<E> {

	private List<E> items;
	private int offset;

	public EntityListImpl(List<E> items, int offset) {
		this.items = items;
		this.offset = offset;
	}

	@Override
	public List<E> getItems() {
		return items;
	}

	@Override
	public int getOffset() {
		return offset;
	}

	@Override
	public void setItems(List<E> items) {
		this.items = items;
	}

	@Override
	public void setOffset(int offset) {
		this.offset = offset;
	}

}
