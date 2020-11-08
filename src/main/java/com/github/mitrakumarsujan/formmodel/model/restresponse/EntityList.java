package com.github.mitrakumarsujan.formmodel.model.restresponse;

import java.util.List;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-31
 */
public interface EntityList<E> {

	public List<E> getItems();
	
	public void setItems(List<E> items);

	public int getOffset();
	
	public void setOffset(int offset);

	public default int getSize() {
		List<E> items = getItems();
		return items == null ? 0 : items.size();
	}
}
