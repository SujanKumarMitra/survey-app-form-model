package com.github.mitrakumarsujan.formmodel.model.restresponse.error;

import java.io.Serializable;
import java.util.Optional;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-26
 */
@JsonDeserialize(as = ErrorInfoImpl.class)
public interface ErrorInfo extends Serializable {
	
	String getReason();
	
	Optional<Throwable> getCause();
}
