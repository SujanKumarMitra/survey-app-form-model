package com.github.mitrakumarsujan.formmodel.model.response;

import java.util.Collection;

import org.springframework.http.ResponseEntity;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-25
 */
@JsonPropertyOrder({ "status", "code", "message", "errors" })
public interface RestErrorResponse extends RestResponse, ResponseEntityAdaptor<RestErrorResponse> {

	Collection<? extends ErrorData> getErrors();

	@Override
	default ResponseEntity<RestErrorResponse> toResponseEntity() {
		return new ResponseEntity<>(this, this.getStatus());
	}
}
