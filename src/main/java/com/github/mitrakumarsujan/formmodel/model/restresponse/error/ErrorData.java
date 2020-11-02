package com.github.mitrakumarsujan.formmodel.model.restresponse.error;

import java.util.Optional;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-26
 */
@JsonDeserialize(as = ErrorDataImpl.class)
public interface ErrorData {
	
	String getReason();
	
	Optional<Throwable> getCause();
	
	String getMessage();
}
