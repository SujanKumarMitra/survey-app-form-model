package com.github.mitrakumarsujan.formmodel.exception;

import java.util.Collection;
import java.util.LinkedList;

import com.github.mitrakumarsujan.formmodel.model.restresponse.error.ErrorData;
import com.github.mitrakumarsujan.formmodel.model.restresponse.error.ErrorDataImpl;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-11-02
 */
public class FormNotFoundException extends ClientDrivenException {

	private static final long serialVersionUID = -6236465458336133712L;

	public FormNotFoundException(String formId) {
		super(new LinkedList<>());
		super.errors.add(new ErrorDataImpl("form not found for id '" + formId + "'"));
	}

	public FormNotFoundException(Collection<ErrorData> errors) {
		super(errors);
	}

}
