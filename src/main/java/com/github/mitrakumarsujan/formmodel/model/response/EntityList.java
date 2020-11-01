package com.github.mitrakumarsujan.formmodel.model.response;

import java.util.List;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-31
 */
public interface EntityList<E> {

	public List<E> getList();

	public void setList(List<E> list);

}
