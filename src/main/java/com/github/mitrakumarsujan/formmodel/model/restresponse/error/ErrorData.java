package com.github.mitrakumarsujan.formmodel.model.restresponse.error;

import java.util.Optional;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-26
 */
public interface ErrorData {
	
	String getReason();
	
	Optional<Throwable> getCause();
	
	String getMessage();
}
