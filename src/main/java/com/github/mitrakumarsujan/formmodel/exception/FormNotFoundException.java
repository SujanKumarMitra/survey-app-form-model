package com.github.mitrakumarsujan.formmodel.exception;

import java.util.Collection;
import java.util.LinkedList;

import com.github.mitrakumarsujan.formmodel.model.restresponse.error.ErrorInfo;
import com.github.mitrakumarsujan.formmodel.model.restresponse.error.ErrorInfoImpl;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-11-02
 */
public class FormNotFoundException extends ClientErrorException {

	private static final long serialVersionUID = -6236465458336133712L;

	public FormNotFoundException(String formId) {
		super(new LinkedList<>());
		super.errors.add(new ErrorInfoImpl("form not found for id '" + formId + "'"));
	}

	public FormNotFoundException(Collection<ErrorInfo> errors) {
		super(errors);
	}

}
