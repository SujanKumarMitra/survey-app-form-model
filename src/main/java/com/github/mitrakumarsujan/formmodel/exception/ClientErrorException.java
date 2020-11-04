package com.github.mitrakumarsujan.formmodel.exception;

import java.util.Collection;
import java.util.Objects;

import com.github.mitrakumarsujan.formmodel.model.restresponse.error.ErrorInfo;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-11-02
 */
public class ClientErrorException extends ApplicationException {

	private static final long serialVersionUID = -6515036983072625397L;

	protected final Collection<ErrorInfo> errors;

	public ClientErrorException(Collection<ErrorInfo> errors) {
		Objects.requireNonNull(errors);
		this.errors = errors;
	}

	public Collection<ErrorInfo> getErrors() {
		return errors;
	}

}