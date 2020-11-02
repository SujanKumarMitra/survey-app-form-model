package com.github.mitrakumarsujan.formmodel.exception;

import com.github.mitrakumarsujan.formmodel.model.restresponse.RestErrorResponse;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-11-02
 */
public class RestExchangeException extends ApplicationException {

	private static final long serialVersionUID = 2977288273638431835L;
	
	protected final RestErrorResponse response;

	public RestExchangeException(RestErrorResponse response) {
		this.response = response;
	}
	
	public RestErrorResponse getResponse() {
		return response;
	}
	
	

}
