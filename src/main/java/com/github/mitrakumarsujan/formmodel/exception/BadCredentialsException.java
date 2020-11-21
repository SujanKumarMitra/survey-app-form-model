package com.github.mitrakumarsujan.formmodel.exception;

import static java.util.Collections.singletonList;

import java.util.Collection;

import com.github.mitrakumarsujan.formmodel.model.restresponse.error.ErrorInfo;
import com.github.mitrakumarsujan.formmodel.model.restresponse.error.ErrorInfoImpl;

/**
 * @author skmitra
 * @since 2020-11-08
 */
public class BadCredentialsException extends ClientErrorException {

	
	private static final long serialVersionUID = -6555018822234704190L;
	
	private static final String DEFAULT_MESSAGE = "Bad Credentials";

	public BadCredentialsException() {
		this(singletonList(new ErrorInfoImpl(DEFAULT_MESSAGE)));
	}

	public BadCredentialsException(String message) {
		this(singletonList(new ErrorInfoImpl(message)));
	}

	public BadCredentialsException(Collection<ErrorInfo> errors) {
		super(errors);
	}

}
