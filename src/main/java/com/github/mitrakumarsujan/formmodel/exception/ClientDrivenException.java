package com.github.mitrakumarsujan.formmodel.exception;

import java.util.Collection;
import java.util.Objects;

import com.github.mitrakumarsujan.formmodel.model.restresponse.error.ErrorData;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-11-02
 */
public class ClientDrivenException extends ApplicationException {

	private static final long serialVersionUID = -6515036983072625397L;

	protected Collection<ErrorData> errors;

	public ClientDrivenException(Collection<ErrorData> errors) {
		Objects.requireNonNull(errors);
		this.errors = errors;
	}

	public Collection<ErrorData> getErrors() {
		return errors;
	}

}