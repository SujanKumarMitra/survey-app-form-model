package com.github.mitrakumarsujan.formmodel.model.restresponse;

import org.springframework.http.ResponseEntity;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-26
 */
public interface ResponseEntityAdaptor<T> {

	ResponseEntity<T> toResponseEntity();
}
