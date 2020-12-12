package com.github.mitrakumarsujan.formmodel.model.dto;

/**
 * @author skmitra
 * @since 2020-11-08
 */
public interface DtoConverter<T,R> {
	
	R convert(T data);
}
